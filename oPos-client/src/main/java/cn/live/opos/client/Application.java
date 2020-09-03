package cn.live.opos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Start class.
 * 
 * @author chenxinjie
 * @date 2020-07-25
 */
@SpringBootApplication
@Configuration
@RestController
@EnableDiscoveryClient
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

  @LoadBalanced
  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
