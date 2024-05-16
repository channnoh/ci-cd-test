package com.unity.cicd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCi {

  @Test
  void test() {
    int x = 1;
    int y = 2;

    Assertions.assertEquals(x,y);

  }

}
