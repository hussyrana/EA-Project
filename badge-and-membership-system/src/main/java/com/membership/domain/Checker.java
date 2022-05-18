package com.membership.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Checker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name="member_id")
    private Member member;
}
