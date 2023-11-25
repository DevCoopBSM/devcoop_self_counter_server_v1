package com.devcoop.kiosk.domain.presentation.dto;

import com.devcoop.kiosk.domain.details.CustomUserDetails;
import com.devcoop.kiosk.domain.entity.UserEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDto {
    @NotBlank
    private String token;
    @NotBlank
    private int exprTime;
    @NotBlank
    private int point;
    @NotBlank
    private String studentName;
}
