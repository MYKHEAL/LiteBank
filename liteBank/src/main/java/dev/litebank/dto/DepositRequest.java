package dev.litebank.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class DepositRequest {
    private String AccountNumber;
    private BigDecimal amount;
    private PaymentMethod paymentMethod;
}
