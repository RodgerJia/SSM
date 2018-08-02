package com.jushq.sms.service;

import com.jushq.sms.mapper.UserMapper;
import com.jushq.sms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<Map> getUserInfo(String username){
        List<Map> list=userMapper.findUserInfo(username);
        //User user=null;
        return list;
    }

}
