package com.master.Project.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);

}
