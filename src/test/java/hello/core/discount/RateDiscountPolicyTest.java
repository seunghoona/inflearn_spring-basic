package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {


    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야한다.")
    void vip_o (){

        //given 아래와같은 데이터가 주어졌을 때
        Member memberVIP = new Member(1L, "memberVIP", Grade.VIP);


        //when 그 데이터르 이러한 비지니스를 실행했을 때
        int discount = discountPolicy.discount(memberVIP, 10000);

        //결과는 아래와같다

        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP는 10% 할인이 적용되지말아야한다.")
    void vip_x (){

        //given 아래와같은 데이터가 주어졌을 때
        Member memberVIP = new Member(1L, "memberVIP", Grade.BASIC);


        //when 그 데이터르 이러한 비지니스를 실행했을 때
        int discount = discountPolicy.discount(memberVIP, 10000);

        //결과는 아래와같다

        //then
        assertThat(discount).isEqualTo(0);
    }




}