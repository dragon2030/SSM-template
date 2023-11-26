package com.bigDragon.service.impl;

import com.bigDragon.dao.UserDao;
import com.bigDragon.entity.User;
import com.bigDragon.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: bigDragon
 * @create: 2022/7/14
 * @Description:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    UserDao userDao;

    @Override
    public List<User> selectAll(){
        List<User> listMap = userDao.selectAll();
        return listMap;
    }
}
