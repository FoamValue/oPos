package cn.live.opos.center.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

  @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
  public String echo(@PathVariable String str) {
    return "Hello Nacos Discovery " + str;
  }
}
