package com.devcoop.kiosk.domain.user.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PinChangeRequest {
  private String codeNumber;
  private String pin;
  private String newPin;
}
