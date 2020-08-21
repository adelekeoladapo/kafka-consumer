package com.bankwithmint.kafkaconsumer.listener;

import com.bankwithmint.kafkaconsumer.dto.CardDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final String TOPIC = "com.ng.vela.even.card_verified";

    @KafkaListener(topics = TOPIC, groupId = "group_json", containerFactory = "cardKafkaListenerFactory")
    public void consumeJson(CardDto cardDto) {
        System.out.println(cardDto);
    }
}
