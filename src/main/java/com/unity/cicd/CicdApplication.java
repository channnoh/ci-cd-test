package com.unity.cicd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CicdApplication {

  public static void main(String[] args) {
    log.info("성공");
    SpringApplication.run(CicdApplication.class, args);
  }

}
