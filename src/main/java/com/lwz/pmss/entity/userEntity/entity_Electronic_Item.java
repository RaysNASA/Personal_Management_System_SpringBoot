package com.lwz.pmss.entity.userEntity;

import lombok.Data;

import java.util.Date;

@Data
public class entity_Electronic_Item {
    int EID;  //电子产品唯一识别码

    String brand;  //品牌名

    String item_name;  //产品名

    int UID;  //用户名

    Date purchase_date;  //购买日期

    float purchase_value;  //购买金额

    int use_frequency;  //使用频率

    int status;  //状态，1-展示态、2-闲置态、3-回收态

    String remarks;  //备注

}
