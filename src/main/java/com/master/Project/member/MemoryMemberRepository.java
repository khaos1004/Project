package com.master.Project.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepsitory{

    private static Map<Long, Member> store = new HashMap<>();
    @Override
    public void save(Member member) {
    store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}