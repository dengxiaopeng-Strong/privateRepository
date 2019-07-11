package enumClass;

import interfaces.BusinessExceptionAssert;


public enum ResponseEnum implements BusinessExceptionAssert {

    BAD_LICENCE_TYPE(7001, "Bad licence type"),
    BAD_NOT_TYPE(7002, "Bad not type");

    private int code;
    private String message;


    ResponseEnum(int i, String s) {

    }

    @Override
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
