package com.master.Project.order;

import com.master.Project.discount.DiscountPolicy;
import com.master.Project.discount.FixDiscountPolicy;
import com.master.Project.member.Member;
import com.master.Project.member.MemberRepsitory;
import com.master.Project.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepsitory memberRepsitory = new MemoryMemberRepository();
    private final DiscountPolicy discountPoicy = new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepsitory.findById(memberId);
        int discountPrice = discountPoicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
