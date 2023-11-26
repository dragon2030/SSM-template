package com.bigDragon.entity;

import lombok.Data;

/**
 * @author: bigDragon
 * @create: 2023/11/26
 * @Description:
 */
@Data
public class User {
    private String id;
    //姓名
    private String name;
    //年龄
    private String age;
    //人物描述
    private String peopleDes;
    //性别标识 1男 2女
    private String sexId;
    
}
