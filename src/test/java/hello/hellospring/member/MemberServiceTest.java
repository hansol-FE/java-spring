package hello.hellospring.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given
        Member member1 = new Member(1L, "홍길동", Grade.VIP);

        //then
        memberService.join(member1);
        Member findMember = memberService.findMember(1L);

        //when
        Assertions.assertThat(member1).isEqualTo(findMember);

    }

}
