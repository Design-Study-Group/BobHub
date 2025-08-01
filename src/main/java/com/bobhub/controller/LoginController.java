package com.bobhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String redirectToGoogle() {
    return "redirect:/oauth2/authorization/google";
  }
}
