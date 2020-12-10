package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {


    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "MemberA", Grade.VIP);
        memberService.join(member);


        Member members = memberService.findMembers(1L);

        members.getName().equals(member.getName());

    }
}
