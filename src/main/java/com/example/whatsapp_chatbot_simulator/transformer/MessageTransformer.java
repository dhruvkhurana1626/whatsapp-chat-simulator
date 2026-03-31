package com.example.whatsapp_chatbot_simulator.transformer;

import com.example.whatsapp_chatbot_simulator.dto.response.MessageResponse;
import java.time.LocalDateTime;

public class MessageTransformer {

    public static MessageResponse messageToMessageResponse(String message){
        MessageResponse messageResponse = MessageResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .reply(message)
                        .build();

        return messageResponse;
    }
}
