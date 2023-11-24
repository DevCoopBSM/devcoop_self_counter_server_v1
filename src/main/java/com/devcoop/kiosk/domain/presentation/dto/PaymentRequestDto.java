package com.devcoop.kiosk.domain.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDto {

    private String requestTimeUtc; // 추가: 요청 시간을 UTC로 저장
    private List<ItemDto> items; // 아이템 목록을 받을 필드

    // 생성자, 게터, 세터 등도 자동으로 생성됨
}