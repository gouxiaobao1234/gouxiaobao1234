package cn.chao.response;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

public class ResponseResult {
    //状态码
    private  Integer code;

    //要返回的数据
    private Object data;

    //返回的提示
    private String massage;

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "code=" + code +
                ", data=" + data +
                ", massage='" + massage + '\'' +
                '}';
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
