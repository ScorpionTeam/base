package com.kunlun.result;


import java.io.Serializable;

/**
 * Created on 2017/9/16.
 */
public class SuccessResult<T> extends BaseResult implements Serializable {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public SuccessResult(T t) {
        this();
        this.t = t;
    }

    public SuccessResult() {
        super(SUCCESS);
    }

    @Override
    public String toString() {
        return "SuccessResult{" +
                "t=" + t +
                '}';
    }
}
