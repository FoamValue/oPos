package cn.live.opos.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Pos Page Controller.
 * 
 * @author chenxinjie
 * @date 2020-07-27
 */
@Controller
public class PosController {

  /**
   * oPos-client Pos-info Page.
   * 
   * @param model
   * @return
   */
  @GetMapping("/pos")
  public String pos(Model model) {
    return "pos";
  }
}
