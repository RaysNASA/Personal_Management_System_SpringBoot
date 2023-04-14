package com.lwz.pmss.entity.systemEntity;

import lombok.Data;

@Data
public class category_List {
    /*
    * 可变
    * 该列表的内容是Cid对应的cate_name和is_entity:cid-7个userEntity中的分类表名-0或1
    * */
    int Cid;  //大分类的唯一识别码

    String cate_name;  //分类名

    int is_entity;  //是否是实体，1-实体、2-虚拟
}
