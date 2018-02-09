package com.uu.dao;

import com.uu.entity.User;

/**
 * @Author: Ecopan
 * @Description:
 * @Date: Created in 1:49 2018-02-09
 * @Modified By:
 */
public interface UserMapper {

    User findByAccount(String account) throws Exception;

    int insertUser(User user) throws Exception;


}
