package com.ycu.ycumall.result;


/** 返回给前端的统一消息码*/
public class CodeMsg {
    private int code;
    private String msg;

    public CodeMsg() {
    }

    public CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    //定义码值
    public static  CodeMsg SUCESS= new CodeMsg(0,"success");

    //通用的错误码
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100,"服务端异常");
    public static CodeMsg BIND_ERROR = new CodeMsg(500101,"参数校验异常:%s");
    public static CodeMsg REQUEST_ILLEGAL = new CodeMsg(500102,"非法请求");
    public static CodeMsg ACCESS_ILIMIT_REACHED = new CodeMsg(500103,"访问太频繁");


    //登录模块 5002
    public static CodeMsg SESSION_ERROR = new CodeMsg(500210,"session 不存在，或者已经失效");
    public static CodeMsg PASSWORD_EMPTY = new CodeMsg(500211,"登陆密码不能为空");
    public static CodeMsg MOBILE_EMPTY = new CodeMsg(500212,"手机号不能为空");
    public static CodeMsg MOBILE_ERROR = new CodeMsg(500213,"手机格式错误");
    public static CodeMsg MOBILE_NOT_EXISTS = new CodeMsg(500214,"手机号不存在");
    public static CodeMsg PASSWORD_ERROR = new CodeMsg(500215,"密码错误");
    public static CodeMsg USER_NO_LOGIN = new CodeMsg(500216,"用户未登录");
    public static CodeMsg USERNAME_PASSWORD_ERROR = new CodeMsg(50017,"用户和密码错误");
    public static CodeMsg USERNAME_NOT_EXISTS = new CodeMsg(500214, "用户名不存在！");
    //商品模块 5003
}
