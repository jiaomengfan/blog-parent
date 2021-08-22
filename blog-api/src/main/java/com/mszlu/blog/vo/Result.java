package com.mszlu.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName Result
 * @Description TODO
 * @Author jiaomf
 * @Date 2021/8/15 11:48
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
public class Result {
    private boolean success;
    private int code;
    private String msg;
    private Object data;


    public static Result success(Object data){
            return new Result(true,200,"success",data);
    }
    public static Result fail(int code,String msg){
        return new Result(true,code,msg,null);
    }


}
