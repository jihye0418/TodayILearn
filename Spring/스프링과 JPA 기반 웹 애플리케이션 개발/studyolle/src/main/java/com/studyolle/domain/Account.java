package com.studyolle.domain;

import javax.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Account {

    @Id @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String nickname;

    private String password;

    //이메일 인증완료 여부
    private boolean emailVerified;

    //이메일 검증 시 사용할 Token 값
    private String emailCheckToken;

    //이메일 인증 완료 후 가입 완료
    private LocalDateTime joinedAt;

    //자기소개
    private String bio;

    private String url;

    //직업
    private String occupation;

    //사는 곳
    private String location;

    @Lob @Basic(fetch = FetchType.EAGER)
    private String profileImage;

    private boolean studyCreatedByEmail;

    private boolean studyCreatedByWeb;

    private boolean studyEnrollmentResultByEmail;

    private boolean studyEnrollmentResultByWeb;

    private boolean studyUpdateByEmail;

    private boolean studyUpdateByWeb;
}
