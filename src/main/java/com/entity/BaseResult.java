package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResult <T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public BaseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
