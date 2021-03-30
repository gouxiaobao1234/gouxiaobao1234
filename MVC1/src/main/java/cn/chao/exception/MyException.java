package cn.chao.exception;

public class MyException extends Exception{

    // 错误的提示消息
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public MyException(String message) {
        this.message = message;
    }
}
