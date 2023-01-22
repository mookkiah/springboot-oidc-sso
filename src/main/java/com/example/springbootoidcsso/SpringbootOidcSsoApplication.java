package com.example.springbootoidcsso;

import java.util.Collections;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@SpringBootApplication
public class SpringbootOidcSsoApplication {


  @GetMapping("/user")
  public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
      System.out.println(principal.getAttributes());
      return Collections.singletonMap("name", principal.getAttribute("name"));
  }
  
  @GetMapping("/error")
  public String error(HttpServletRequest request) {
      String message = (String) request.getSession().getAttribute("error.message");
      request.getSession().removeAttribute("error.message");
      return message;
  }

  public static void main(String... args) {
    SpringApplication.run(SpringbootOidcSsoApplication.class, args);
  }
  
  

}
