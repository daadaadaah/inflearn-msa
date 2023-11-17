package com.msa.member.domain.model.application.usecase;

import com.msa.member.domain.model.framework.web.dto.MemberOutPutDTO;
import com.msa.member.domain.model.vo.IDName;

public interface UsePointUsecase {
    public MemberOutPutDTO userPoint(IDName idName, long point) throws Exception;
}
