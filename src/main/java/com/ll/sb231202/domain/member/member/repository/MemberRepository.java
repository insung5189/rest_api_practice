package com.ll.sb231202.domain.member.member.repository;

import com.ll.sb231202.domain.member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}