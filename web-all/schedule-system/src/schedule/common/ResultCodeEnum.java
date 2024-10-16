package schedule.common;

public enum ResultCodeEnum {
    SUCCESS(200, "success"),
    USERNAME_ERROR(501, "userNameError"),
    PAASWORD_ERROR(502, "pwdError"),
    NOTLOGIN(503, "notlogin"),
    USERNAME_USERD(504, "usernameused");


    private Integer code;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
