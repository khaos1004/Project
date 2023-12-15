package com.master.Project.order;

import com.master.Project.member.Grade;
import com.master.Project.member.Member;
import com.master.Project.member.MemberService;
import com.master.Project.member.MemberServiceImpl;

public class
OderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP );
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
