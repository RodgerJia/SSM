package com.jushq.sms.controller;

import com.alibaba.fastjson.JSONObject;
import com.jushq.sms.model.User;
import com.jushq.sms.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
@RequestMapping("/jsqcrm")
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getPhone")
    @ResponseBody
    public JSONObject getUserInfo(@RequestBody User user) {
        JSONObject json = new JSONObject();
        String username=user.getUsername();
        List<Map> list = userService.getUserInfo(username);
        if(list!=null){
            System.out.println(list);
            logger.info(list);
        }
//        json.put("mobilephone",list.get(0).get("mobilephone"));
        json.put("mobilephone","13683185018");
        return json;
    }
}
