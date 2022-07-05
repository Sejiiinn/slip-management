package sejin.slipmanagement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sejin.slipmanagement.domain.entity.Member;
import sejin.slipmanagement.repository.MemberRepository;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/members")
    public List<Member> findAll() {
        log.info("findAll = {}", memberRepository.findAll());

        return memberRepository.findAll();
    }
}