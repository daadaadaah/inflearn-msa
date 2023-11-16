package com.msa.member.domain.model.application.inputport;

import com.msa.member.domain.model.Member;
import com.msa.member.domain.model.application.outputport.MemberOutPutPort;
import com.msa.member.domain.model.application.usecase.SavePointUsecase;
import com.msa.member.domain.model.framework.web.dto.MemberOutPutDTO;
import com.msa.member.domain.model.vo.IDName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class SavePointInputPort implements SavePointUsecase {

    private final MemberOutPutPort memberOutPutPort;

    @Override
    public MemberOutPutDTO savePoint(IDName idName, Long point) {
        Member loadMember = memberOutPutPort.loadMemberByIdName(idName);
        loadMember.savePoint(point);
        return MemberOutPutDTO.mapToDTO(loadMember);
    }
}
