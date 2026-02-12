package com.mynotes.model.vo.user;

/**
 * After Registration
 * return userID
 */

public class RegisterVO {
    private Long userID;

    @Override
    public String toString() {
        return "RegisterVO{" +
                "userID=" + userID +
                '}';
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public RegisterVO(Long userID) {
        this.userID = userID;
    }
}
