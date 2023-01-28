package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@Configurable
public class KafkaProducerConfig {

    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name("wikimediatopic").build();
    }
}
