package hello.hellospring.order;

import hello.hellospring.member.Grade;
import hello.hellospring.member.Member;
import hello.hellospring.member.MemberService;
import hello.hellospring.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService  = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member1 = new Member(memberId, "홍길동", Grade.VIP);
        memberService.join(member1);

        Order order = orderService.createOrder(memberId, "애플워치", 10000 );

        System.out.println("order = " + order);
        System.out.println("order price = " + order.calculatePrice());
    }
}
