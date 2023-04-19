package com.lwz.pmss.entity.systemEntity;

import java.util.Date;

public class invest_List {
    /*
    * 可变
    * 该列表内容是交易明细表
    * */
    int IVID;  //交易唯一识别码

    String item;  //交易项目名

    float value;  //交易金额

    Date invest_date;  //充值时间

    Date cycle;  //交易项目起止时间的天数差

    Date expire_date;  //交易的终止时间，由invest_date+cycle得到

    int Uid;  //用户的唯一识别码
}
