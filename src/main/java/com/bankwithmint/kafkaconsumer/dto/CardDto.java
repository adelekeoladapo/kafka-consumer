package com.bankwithmint.kafkaconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class CardDto {
    String scheme;
    String type;
    String bank;

    @Override
    public String toString() {
        return "CardDto{" +
                "scheme='" + scheme + '\'' +
                ", type='" + type + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }
}
