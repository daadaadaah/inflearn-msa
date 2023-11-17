package com.msa.member.domain.model.application.usecase;

import com.msa.member.domain.model.framework.web.dto.MemberOutPutDTO;
import com.msa.member.domain.model.vo.IDName;

public interface SavePointUsecase {
    public MemberOutPutDTO savePoint(IDName idName, Long point);
}
