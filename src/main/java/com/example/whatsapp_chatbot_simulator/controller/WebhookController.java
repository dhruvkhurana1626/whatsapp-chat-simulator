package com.example.whatsapp_chatbot_simulator.controller;

import com.example.whatsapp_chatbot_simulator.dto.request.MessageRequest;
import com.example.whatsapp_chatbot_simulator.dto.response.MessageResponse;
import com.example.whatsapp_chatbot_simulator.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/webhook")
public class WebhookController {

    private final ChatService chatService;

    @PostMapping
    public ResponseEntity handleMessage(@RequestBody MessageRequest messageRequest){
        MessageResponse messageResponse = chatService.handleMessage(messageRequest);
        System.out.println("Incoming message: " + messageRequest.getMessage());
        return ResponseEntity.ok(messageResponse);
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running";
    }
}
