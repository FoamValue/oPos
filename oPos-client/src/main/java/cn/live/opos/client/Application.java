package cn.live.opos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Start class.
 * 
 * @author chenxinjie
 * @date 2020-07-25
 */
@SpringBootApplication
@Configuration
@RestController
public class Application {

  /**
   * Start method.
   * 
   * @param args 传入参数
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    System.out.println("BootApplication start");

  }
}
