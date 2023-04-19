package com.lwz.pmss.entity.userEntity;

import lombok.Data;

import java.util.Date;

@Data
public class virtually_ViewMovies_Item {
    int VID;  //影视唯一识别码

    String movies_name;  //影视名

    String director;  //导演名

    String main_performer;  //主要演员

    int UID;  //用户名

    Date in_date;  //收入日期

    Date purchase_date;  //购买时间 与上面的收入时间二选一
}
