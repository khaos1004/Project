package com.master.Project.member;

public interface MemberRepsitory {
    void save(Member member);

    Member findById(Long memberId);
}
