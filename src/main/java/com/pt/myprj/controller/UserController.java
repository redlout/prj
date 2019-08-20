package com.pt.myprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("api/user")
public class UserController {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public Map login(HttpSession httpSession){
        Map<String, Object> map = new HashMap<String, Object>();

        try {
            map.put("errorCode", 0);
            map.put("message", "hello");
        } catch (Exception e) {
            map.put("errorCode", 1);
            map.put("errorMessage", "未知错误");
        }
        return map;
    }
}
