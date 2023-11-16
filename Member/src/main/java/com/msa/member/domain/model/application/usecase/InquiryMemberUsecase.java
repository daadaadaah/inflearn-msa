package com.msa.member.domain.model.application.usecase;

import com.msa.member.domain.model.framework.web.dto.MemberOutPutDTO;

public interface InquiryMemberUsecase {
    public MemberOutPutDTO getMember(long memberNo);
}
