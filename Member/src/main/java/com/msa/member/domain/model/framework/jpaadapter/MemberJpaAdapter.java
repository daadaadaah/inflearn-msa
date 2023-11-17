package com.msa.member.domain.model.framework.jpaadapter;


import com.msa.member.domain.model.Member;
import com.msa.member.domain.model.application.outputport.MemberOutPutPort;
import com.msa.member.domain.model.vo.IDName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberJpaAdapter implements MemberOutPutPort {
    private final MemberRepository memberRepository;

    @Override
    public Member loadMember(long memberNo) {
        return memberRepository.findById(memberNo).get();
    }
    @Override
    public Member loadMemberByIdName(IDName idName) {
        return memberRepository.findMemberByIdName(idName).get();
    }
    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }
}