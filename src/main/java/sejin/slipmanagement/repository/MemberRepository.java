package sejin.slipmanagement.repository;

import org.apache.ibatis.annotations.Mapper;
import sejin.slipmanagement.domain.Member;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberRepository {
    void save(Member member);

    Optional<Member> findById(int id);

    Optional<Member> findByName(String name);

    List<Member> findAll();
}
