package com.bigDragon.dao;

import com.bigDragon.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author: bigDragon
 * @create: 2022/7/14
 * @Description:
 */
@Repository
public interface UserDao {
    public List<User> selectAll();
    
}
