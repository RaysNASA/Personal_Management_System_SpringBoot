package com.lwz.pmss.entity.systemEntity;

import lombok.Data;

@Data
public class user_List {

    /*
    * 可变
    * 该列表内容是Uid对应的信息
    * */
    int UID;  //用户唯一识别码

    String user_name;  //用户名

    String user_password;  //用户密码

    int AID;  //用户权限
}
