package com.bigDragon.service;

import com.bigDragon.entity.User;

import java.util.List;

/**
 * @author: bigDragon
 * @create: 2023/11/26
 * @Description:
 */
public interface IUserService {
    public List<User> selectAll();
}
