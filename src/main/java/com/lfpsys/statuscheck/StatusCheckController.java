package com.lfpsys.statuscheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusCheckController {

  @GetMapping("/v1/statuscheck")
  public String getStatusCheck() {
    return "OK";
  }
}
