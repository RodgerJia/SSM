package com.jushq.sms.mapper;

import com.jushq.sms.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
    public List<Map> findUserInfo(String username);
}
