package com.hebut.wms.common;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class Result {
    /**
     * 状态码
     * 200：成功
     * 400：失败
     */
    private int code;
    /**
     * 信息
     * 成功
     * 失败
     */
    private String msg;
    /**
     * 总记录数（可选）
     */
    private Long total;
    /**
     * 数据
     */
    private Object data;

    public static Result fail() {
        return result(400, "失败", 0L, null);
    }

    public static Result suc() {
        return result(200, "成功", 0L, null);
    }

    public static Result suc(Object data) {
        return result(200, "成功", 0L, data);
    }

    public static Result suc(Object data, Long total) {
        return result(200, "成功", total, data);
    }

    private static Result result(int code, String msg, Long total, Object data) {
        Result res = new Result();
        res.setData(data);
        res.setMsg(msg);
        res.setCode(code);
        res.setTotal(total);
        return res;
    }

}
