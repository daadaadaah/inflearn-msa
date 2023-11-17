package com.msa.member.domain.model.application.usecase;

import com.msa.member.domain.model.framework.web.dto.MemberInfoDTO;
import com.msa.member.domain.model.framework.web.dto.MemberOutPutDTO;

public interface AddMemberUsecase {
    public MemberOutPutDTO addMember(MemberInfoDTO memberInfoDTO);
}
