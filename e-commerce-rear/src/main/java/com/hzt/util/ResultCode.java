package com.hzt.util;

public enum ResultCode {
    SUCCESS(200,"请求成功"),
    ERROR(500,"请求失败");
    private Integer code;
    private String message;
    public Integer getCode() {
        return code;
    }
   
    public String getMessage() {
        return message;
    }
   
   
    private ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    
    
}
