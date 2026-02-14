package com.mynotes.model.vo.user;

/**
 * After Registration
 * return userID
 */

public class RegisterVO {
    private Long userId;

    @Override
    public String toString() {
        return "RegisterVO{" +
                "userID=" + userId +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public RegisterVO(Long userId) {
        this.userId = userId;
    }

    public RegisterVO() {}
}
