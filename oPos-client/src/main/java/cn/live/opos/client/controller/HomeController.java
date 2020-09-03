package cn.live.opos.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Home Page Controller.
 * 
 * @author chenxinjie
 * @date 2020-07-25
 */
@Controller
public class HomeController {

  /**
   * oPos-client Home-info Page.
   * 
   * @return
   */
  @GetMapping("/info")
  public String info(Model model) {
    model.addAttribute("SystemName", "oPosClient");
    return "info";
  }

  private final RestTemplate restTemplate;

  @Autowired
  public HomeController(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @ResponseBody
  @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
  public String echo(@PathVariable String str) {
    return restTemplate.getForObject("http://oPos-center/echo/" + str, String.class);
  }

}
