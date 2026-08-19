package com.substring.agent.backend.ai_agent_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

 @GetMapping
  public ResponseEntity<String> welcome() {
    return ResponseEntity.ok("Welcome to the AI Agent Backend!");
  }
}

