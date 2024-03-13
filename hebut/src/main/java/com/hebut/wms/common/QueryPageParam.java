package com.hebut.wms.common;

import lombok.Data;

import java.util.HashMap;

@Data
public class QueryPageParam {
    private static int PAGE_SIZE = 20;
    private static int PAGE_NUM = 1;
    //    设置默认值，不至于返回的是0
    private int pageSize = PAGE_SIZE;
    private int pageNum = PAGE_NUM;
    //    这俩就是分页的东西，单独
    //    其他的所有的参数比如name num id 都放在这个hashmap里面
    private HashMap param = new HashMap();

}
