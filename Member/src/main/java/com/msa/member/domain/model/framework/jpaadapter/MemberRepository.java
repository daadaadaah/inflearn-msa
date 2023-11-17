package com.msa.member.domain.model.framework.jpaadapter;

import com.msa.member.domain.model.Member;
import com.msa.member.domain.model.vo.IDName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    public Optional<Member> findMemberByIdName(IDName idName);
}
