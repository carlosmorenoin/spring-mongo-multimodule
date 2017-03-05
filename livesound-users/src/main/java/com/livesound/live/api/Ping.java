package com.livesound.live.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ping {

    @RequestMapping("/ping")
    @ResponseBody
    String getPing() {
        return "Pingggg4!!!!";
    }
}
