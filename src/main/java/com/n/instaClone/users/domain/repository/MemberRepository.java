package com.n.instaClone.users.domain.repository;

import com.n.instaClone.users.domain.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Long> {
}
