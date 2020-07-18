package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {


    QUESTION_NOT_FOUND("你访问的帖子不存在啦，换个试试吧");

    @Override
    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
