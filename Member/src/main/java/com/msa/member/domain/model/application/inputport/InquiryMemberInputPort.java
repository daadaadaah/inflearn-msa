package com.msa.member.domain.model.application.inputport;

import com.msa.member.domain.model.Member;
import com.msa.member.domain.model.application.outputport.MemberOutPutPort;
import com.msa.member.domain.model.application.usecase.InquiryMemberUsecase;
import com.msa.member.domain.model.framework.web.dto.MemberOutPutDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class InquiryMemberInputPort implements InquiryMemberUsecase {

    private final MemberOutPutPort memberOutPutPort;

    @Override
    public MemberOutPutDTO getMember(long memberNo) {
        Member loadMember = memberOutPutPort.loadMember(memberNo);
        return MemberOutPutDTO.mapToDTO(loadMember);
    }
}