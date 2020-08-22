package cn.live.opos.client.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cn.live.opos.client.dto.GuideDTO;

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
    model.addAttribute("systemName", "开源 POS 系统");
    model.addAttribute("orderNo", "OD20200816000001");
    
    List<GuideDTO> guides = new ArrayList<>();
    guides.add(new GuideDTO("UG001", "泰罗奥特曼"));
    guides.add(new GuideDTO("UG002", "哆啦A梦"));
    guides.add(new GuideDTO("UG003", "朽木露琪亚"));
    model.addAttribute("guides", guides);
    
    return "pos";
  }
}
