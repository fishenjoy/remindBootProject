package com.zzy.common.result;

/**
 * @program: remindBootProject
 * @description: 响应结果生成工厂类
 * @author: Zack Zhang
 * @create: 2019-06-30 19:46
 **/
public class ResultFactory {

    public static Result buildSuccessResult(Object data) {
        return buidResult(ResultCode.SUCCESS, "成功", data);
    }

    public static Result buildFailResult(String message) {
        return buidResult(ResultCode.FAIL, message, null);
    }

    public static Result buidResult(ResultCode resultCode, String message, Object data) {
        return buidResult(resultCode.code, message, data);
    }

    public static Result buidResult(int resultCode, String message, Object data) {
        return new Result(resultCode, message, data);
    }
}