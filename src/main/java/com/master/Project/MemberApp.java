package com.master.Project;

import com.master.Project.member.Grade;
import com.master.Project.member.Member;
import com.master.Project.member.MemberService;
import com.master.Project.member.MemberServiceImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("keroro");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
            tx.commit();
        } catch (Exception e){
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.clear();
        }
        emf.close();

        Member findMember = memberService.findMember(1L);
        System.out.println("findMember = " + findMember);
        System.out.println("new Member = " + member);
    }
}
