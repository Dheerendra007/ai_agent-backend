package com.substring.agent.backend.ai_agent_backend.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/v1/")
public class ChatController {

     
    private ChatClient chatClient;
    
    public ChatController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }
    
    @GetMapping("chat")
    public ResponseEntity<String> chat(@RequestParam (value = "q", required = true) 
    String q) {
        // Here you can implement the logic to handle the chat message and generate a response.
        // For demonstration purposes, we'll just echo back the received message.
        var response = chatClient.prompt(q).call().content();
        return ResponseEntity.ok(response);
    }
    
}
