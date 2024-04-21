package com.pharma.industries.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class KafKaConsumer {
    private static final String TOPIC = "drug-topic";
    private static final String GROUP_ID = "drug";
    List<Integer> list = new ArrayList<>();


    @KafkaListener(topics = TOPIC, groupId = GROUP_ID)
    public void consume(ConsumerRecord<?, ?> consumerRecord, Acknowledgment ack) {

        int i = 0;
        log.info(String.format("Message received -> %s", consumerRecord.value().toString()));
        list.add(i);
        System.out.println(" #### List " + list.size());
        i++;
        ack.acknowledge();
    }
}
