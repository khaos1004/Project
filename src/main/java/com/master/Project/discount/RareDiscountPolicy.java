package com.master.Project.discount;

import com.master.Project.member.Grade;
import com.master.Project.member.Member;

public class RareDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return  price * discountPercent / 100;
        }else {
            return 0;
        }
    }
}
