package cn.live.opos.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Start class.
 * 
 * @author chenxinjie
 * @date 2020-08-01
 */
@SpringBootApplication
@Configuration
@EnableJpaAuditing
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
