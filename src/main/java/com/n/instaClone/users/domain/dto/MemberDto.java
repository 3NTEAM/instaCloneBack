package com.n.instaClone.users.domain.dto;

import com.n.instaClone.users.domain.model.Member;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MemberDto {

    private String name;
    private String password;
    private String phone;
    private String role;

    public Member toEntity(
            String name,
            String password,
            String phone,
            String role
    ) {
        return new Member(name, password, phone, role);
    }
}
