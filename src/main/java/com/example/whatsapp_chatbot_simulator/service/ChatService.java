package com.example.whatsapp_chatbot_simulator.service;

import com.example.whatsapp_chatbot_simulator.dto.request.MessageRequest;
import com.example.whatsapp_chatbot_simulator.dto.response.MessageResponse;
import com.example.whatsapp_chatbot_simulator.transformer.MessageTransformer;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    public MessageResponse handleMessage(MessageRequest messageRequest) {

        String message = messageRequest.getMessage().trim().toLowerCase();

        if(message==null)
            return MessageTransformer.messageToMessageResponse("Invalid Message");

        switch(message){
            case "hi" :
                return MessageTransformer.messageToMessageResponse("Hello");
            case "bye" :
                return MessageTransformer.messageToMessageResponse("Goodbye");
        }

        return MessageTransformer.messageToMessageResponse("I dont Understand that");
    }
}
