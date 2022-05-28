package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //name을 JPQL로 설정해서 다양한 옵션기능 구현가능
    //JPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
