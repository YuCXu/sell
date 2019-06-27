package com.xyc.VO;

import java.io.Serializable;

/**
 * http请求返回的最外层对象
 */
public class ResultVO<T> implements Serializable{
    private static final long serialVersionUID = 8707754967843045905L;
    //错误码
    private Integer code;
    //提示信息
    private String msg;
    //具体内容
    private T data;

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
