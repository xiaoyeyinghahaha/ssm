package com.wxl.domian;

import lombok.Data;
//实体
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
