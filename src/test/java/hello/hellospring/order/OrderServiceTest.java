package hello.hellospring.order;

import hello.hellospring.member.Grade;
import hello.hellospring.member.Member;
import hello.hellospring.member.MemberService;
import hello.hellospring.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();
    @Test
    void createOrder(){
        //given
        Long memberId = 1L;
        Member member1 = new Member(memberId, "홍길동", Grade.VIP);
        memberService.join(member1);

        //when
        Order order = orderService.createOrder(memberId, "애플워치", 10000 );

        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}
