package com.lwz.pmss.entity.systemEntity;

import lombok.Data;

@Data
public class user_Authority_List {

    /*
    * 固定
    * 该列表内容为Aid对应的authority_name：1-用户、2-闲置管理员、3-回收管理员、4-系统管理员
    * */
    int Aid;  //权限的唯一识别码

    String authority_name;  //权限名
}
