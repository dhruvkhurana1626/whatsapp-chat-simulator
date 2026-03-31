package com.example.whatsapp_chatbot_simulator.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class MessageResponse {
    private String reply;
    private LocalDateTime timeStamp;
}
