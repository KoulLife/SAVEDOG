package com.example.savedog;

import com.example.savedog.vo.Board;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SavedogApplication {

  public static void main(String[] args) {
    SpringApplication.run(SavedogApplication.class, args);
  }

  @Bean
  public List<Board> boardList(){
    return new ArrayList<>();
  }
}
