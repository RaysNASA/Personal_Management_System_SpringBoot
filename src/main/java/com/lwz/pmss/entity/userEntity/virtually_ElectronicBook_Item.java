package com.lwz.pmss.entity.userEntity;

import lombok.Data;

import java.util.Date;

@Data
public class virtually_ElectronicBook_Item {
    int EBid;  //电子资料唯一识别码

    String book_name;  //资料名

    String author_name;  //作者名

    String browser_name;  //平台名

    int Uid;  //用户名

    Date purchase_date;  //购买日期

    float purchase_value;  //购买金额

    int read_frequency;  //阅读频率

    int status;  //状态，1-展示态、2-闲置态、3-回收态

    String remarks;  //备注
}
