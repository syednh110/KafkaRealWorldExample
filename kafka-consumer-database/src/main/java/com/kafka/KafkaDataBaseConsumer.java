package com.kafka;

import com.kafka.Model.WikiMedia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDataBaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDataBaseConsumer.class);

    @Autowired
    private WikimediaRepository wikimediaRepository;

    @KafkaListener(topics = "wikimediatopic", groupId ="myGroup")
    public void consume(String message){
        LOGGER.info("Stream Message received %s -->",message);
        WikiMedia wikiMedia = new WikiMedia();
        wikiMedia.setMessage(message);
        wikimediaRepository.save(wikiMedia);
    }
}
