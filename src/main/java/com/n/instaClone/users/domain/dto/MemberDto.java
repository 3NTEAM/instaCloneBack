package com.n.instaClone.users.domain.dto;

import com.n.instaClone.users.domain.model.Member;
import lombok.Getter;


@Getter
public class MemberDto {

    private String name;
    private String password;
    private String email;
    private String role;

    public Member toEntity(
            String name,
            String password,
            String email,
            String role
    ) {
        return new Member(name, password, email, role);
    }
}
