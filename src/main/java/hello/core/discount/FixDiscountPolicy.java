package hello.core.discount;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int disocuntFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        //enum은 ==으로 비교
        if(member.getGrade() == Grade.VIP){
            return
                    disocuntFixAmount;
        }else{
            return 0;
        }
    }

}
