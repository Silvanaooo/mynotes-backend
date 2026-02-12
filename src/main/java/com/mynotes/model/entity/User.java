package com.mynotes.model.entity;

import java.time.LocalDateTime;


/**
 * User Entity
 *
 * Purpose:
 * - user basic info
 * - data only
 *
 * */

public class User {

    /**
     * UserId : cannot change
     */
    private Long userId;

    /**
     * set by user, cannot change after register
     * include digits, letters, underscore
     */
    private String account;

    /**
     * username, can be changed
     * include digits, letters, underscore
     */
    private String username;

    /**
     * hashed password
     */
    private String password;

    /**
     * email
     */
    private String email;

    /**
     * create time
     */
    private LocalDateTime createAt;

    /**
     * update time
     */
    private LocalDateTime updateAt;

    /**
     * last login time
     */
    private LocalDateTime lastLoginAt;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Long getUserId() {
        return userId;
    }

    public String getAccount() {
        return account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public LocalDateTime getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(LocalDateTime lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", lastLoginAt=" + lastLoginAt +
                '}';
    }
}
