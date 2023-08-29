package hello.hellospring.discount;

import hello.hellospring.member.Grade;
import hello.hellospring.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private final int fixDiscountAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) return fixDiscountAmount;
        else return 0;
    }
}
