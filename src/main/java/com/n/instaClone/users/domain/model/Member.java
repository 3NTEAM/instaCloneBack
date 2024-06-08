package com.n.instaClone.users.domain.model;

import jakarta.persistence.*;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String email;
    private String role;
    @CreationTimestamp
    private Timestamp createDate;


    @Builder
    public Member(String _name, String _password, String _email, String _role) {
        this.name = _name;
        this.password = _password;
        this.email = _email;
        this.role = _role;
    }

    public Member() {

    }
}
