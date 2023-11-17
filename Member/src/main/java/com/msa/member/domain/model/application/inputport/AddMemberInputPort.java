package com.msa.member.domain.model.application.inputport;

import com.msa.member.domain.model.Member;
import com.msa.member.domain.model.application.outputport.MemberOutPutPort;
import com.msa.member.domain.model.application.usecase.AddMemberUsecase;
import com.msa.member.domain.model.framework.web.dto.MemberInfoDTO;
import com.msa.member.domain.model.framework.web.dto.MemberOutPutDTO;
import com.msa.member.domain.model.vo.Email;
import com.msa.member.domain.model.vo.IDName;
import com.msa.member.domain.model.vo.PassWord;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AddMemberInputPort implements AddMemberUsecase {

    private final MemberOutPutPort memberOutPutPort;

    @Override
    public MemberOutPutDTO addMember(MemberInfoDTO memberInfoDTO) {
        IDName idName = new IDName(memberInfoDTO.getId(),memberInfoDTO.getName());
        PassWord pwd = new PassWord(memberInfoDTO.getPassWord(),memberInfoDTO.getPassWord());
        Email email = new Email(memberInfoDTO.getEmail());
        Member addedMember = Member.registerMember(idName,pwd,email);
        Member savedMember = memberOutPutPort.saveMember(addedMember);
        return MemberOutPutDTO.mapToDTO(savedMember);
    }
}

