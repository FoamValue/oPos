package cn.live.opos.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
