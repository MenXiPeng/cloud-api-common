package com.mxp.cloudapicommon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> implements Serializable {

    public int code;
    public String message;
    public T data;

    public CommonResult(int code,String message){
        this(code,message,null);
    }

}
