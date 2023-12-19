package com.master.Project.discount;

import com.master.Project.member.Grade;
import com.master.Project.member.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RareDiscountPolicyTest {
    RareDiscountPolicy discountPolicy = new RareDiscountPolicy();

    @Test
    @DisplayName("Vip는 10% 할인이 적용 되어야 한다.")
    void vip_o(){
        //given
        Member member = new Member(1L, "memberVIP", Grade.VIP);

        //when
        int discount = discountPolicy.discount(member, 10000);

        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("Basic은 10% 항인이 적용되지 않아야 한다.")
    void vip_x(){
        //given
        Member member = new Member(2L, "member is basic", Grade.BASIC);

        //when
        int discount = discountPolicy.discount(member, 10000);

        //then
        assertThat(discount).isEqualTo(1000);
    }
}