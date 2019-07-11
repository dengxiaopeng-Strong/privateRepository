package classes;

import interfaces.IResponseEnum;

public class BusinessException extends BaseException {

    public BusinessException(IResponseEnum responseEnum) {
        super(responseEnum);
    }

    public BusinessException(int code, String msg) {
        super(code, msg);
    }

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message) {
        super(responseEnum, args, message);
    }

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(responseEnum, args, message, cause);
    }
}
