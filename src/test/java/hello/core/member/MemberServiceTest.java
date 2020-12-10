package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();


    @Test
    void join(){
        //GIVEN 이런 환경이 주어졌을 때
        Member member = new Member(1L, "memberA", Grade.VIP);

        //WHEN 이렇게 했을 때
        memberService.join(member);
        Member findMember = memberService.findMembers(1L);

        //THEN 이렇게 된다.
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
