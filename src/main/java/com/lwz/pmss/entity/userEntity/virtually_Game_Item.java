package com.lwz.pmss.entity.userEntity;

import lombok.Data;

import java.util.Date;

@Data
public class virtually_Game_Item {
    int GID;  //平台和软件的唯一识别码

    String game_name;  //游戏名称

    String district_server;  //区服

    String download_address;  //下载地址

    String account;  //账号

    String password;  //密码

    int UID;  //用户名

    Date register_date;  //注册日期

    float purchase_value;  //购买金额

    int use_frequency;  //使用频率

    int status;  //状态，1-展示态、2-闲置态、3-回收态

    int IMid;  //交易项唯一识别码

}
