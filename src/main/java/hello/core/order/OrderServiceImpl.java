package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        //회원정보를 조회 
        Member member = memberRepository.findById(memberId);

        //해당 회원의 할인 정책을 조회
        int discountPrice = discountPolicy.discount(member, itemPrice);

        //최종 생성된 주문을 리턴
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
