package com.devcoop.kiosk.domain.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    private int studentNumber;
    private String codeNumber;
    private String pin;
    private String studentName;
    private String email;
    private String password;
    private int point;
    private Short isAdmin;
    private Short isCoop;
    private String type;
    private String pointStatus;
    private String refToken;

    @Builder
    public User(
            int studentNumber, String codeNumber, String pin, String studentName,
            String email, String password, int point, Short isAdmin,
            Short isCoop, String type, String pointStatus, String refToken
    ) {
        this.studentNumber = studentNumber;
        this.codeNumber = codeNumber;
        this.pin = pin;
        this.studentName = studentName;
        this.email = email;
        this.password = password;
        this.point = point;
        this.isAdmin = isAdmin;
        this.isCoop = isCoop;
        this.type = type;
        this.pointStatus = pointStatus;
        this.refToken = refToken;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void update(String pin) {
      this.pin = pin;
    }
}
