package com.mynotes.model.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;

import java.time.LocalDateTime;


/**
 * RegisterRequest Data transfer object
 *
 * JSON body sent from the client when registering
 *
 * JSON returned
 * {
 *   "account": "silvana_01",
 *   "username": "Silvana",
 *   "password": "123456",
 *   "email": "a@b.com"
 * }
 */

public class RegisterRequest {

    /**
     * set by user, cannot change after register
     * include digits, letters, underscore
     */
    @NotBlank(message = "Account must not be blank")
    @Size(min = 6, max = 24, message = "Account length must be between 6 and 24")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Account can only contain letters, digits, and underscore")
    private String account;

    /**
     * username, can be changed
     * include digits, letters, underscore
     */
    @NotBlank(message = "Username must not be blank")
    @Size(max = 16, message = "Username length must be <= 16")
    @Pattern(
            regexp = "^[\\u4e00-\\u9fa5_a-zA-Z0-9\\-\\.]+$",
            message = "Username can contain Chinese chars, letters, digits, underscore"
    )
    private String username;

    /**
     * hashed password
     */
    @NotBlank(message = "Password must not be blank")
    @Size(min = 6, max = 32, message = "Password length must be between 6 and 32")
    private String password;

    /**
     * email
     */
    @Email(message = "Email format is invalid")
    private String email;

    @Size(min = 6, max = 6, message = "Verification code must be 6 characters")
    private String verifyCode;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public RegisterRequest() {}
}
