package sejin.slipmanagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import sejin.slipmanagement.controller.MemberDTO;
import sejin.slipmanagement.domain.Member;
import sejin.slipmanagement.domain.Slip;
import sejin.slipmanagement.repository.MemberRepository;
import org.springframework.stereotype.Service;
import sejin.slipmanagement.repository.SlipRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;
    private final SlipRepository slipRepository;

    /**
     * 회원 가입
     */
    @Transactional
    public int join(MemberDTO memberDTO) {
        Member member = new Member();
        Slip slip = new Slip();

        member.setId(memberDTO.getId());
        member.setName(memberDTO.getName());
        slip.setMember_id(memberDTO.getId());

        validateDuplicateMember(member); // 중복 회원 검증

        memberRepository.save(member);
        slipRepository.save(slip);

        return member.getId();
    }
    

    private void validateDuplicateMember(Member member) {
        memberRepository.findById(member.getId())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
}