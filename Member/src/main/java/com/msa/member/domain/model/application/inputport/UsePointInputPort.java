package com.msa.member.domain.model.application.inputport;

import com.msa.member.domain.model.Member;
import com.msa.member.domain.model.application.outputport.MemberOutPutPort;
import com.msa.member.domain.model.application.usecase.UsePointUsecase;
import com.msa.member.domain.model.framework.web.dto.MemberOutPutDTO;
import com.msa.member.domain.model.vo.IDName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UsePointInputPort implements UsePointUsecase {

    private final MemberOutPutPort memberOutPutPort;

    @Override
    public MemberOutPutDTO userPoint(IDName idName, long point) throws Exception {
        Member loadMember = memberOutPutPort.loadMemberByIdName(idName);
        loadMember.usePoint(point);
        return MemberOutPutDTO.mapToDTO(loadMember);
    }
}
