package com.n.instaClone.users.service;

import com.n.instaClone.users.domain.dto.MemberDto;
import com.n.instaClone.users.domain.model.Member;
import com.n.instaClone.users.domain.repository.MemberRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private PasswordEncoder passwordEncoder;
    private MemberRepository memberRepository;


    public Member createAccount(MemberDto memberDto){
        return memberRepository.save(
                memberDto.toEntity(
                memberDto.getName(),
                passwordEncoder.encode(memberDto.getPassword()),
                memberDto.getPhone(),
                memberDto.getRole()
        ));
    }
}
