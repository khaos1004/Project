package com.master.Project;

import com.master.Project.member.Grade;
import com.master.Project.member.Member;
import com.master.Project.member.MemberService;
import com.master.Project.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("findMember = " + findMember);
        System.out.println("new Member = " + member);
    }
}
