package com.example.savedog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardPageController {
  @GetMapping("/")
  public String getBoardListView() {
    return "board";
  }
}
