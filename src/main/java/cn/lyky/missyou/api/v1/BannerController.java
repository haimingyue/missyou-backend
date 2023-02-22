package cn.lyky.missyou.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/v1/banner")
public class BannerController {
    @GetMapping ("/test")
//    @RequestMapping(value = "/test", method = { RequestMethod.GET })
    @ResponseBody
    public String test () {
        return "hello spring 钱合明111222333";
    }
}
