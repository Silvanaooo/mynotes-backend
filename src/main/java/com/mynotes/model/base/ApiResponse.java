package com.mynotes.model.base;

/**
 * Formatted API response
 * code
 * message
 * data
 */

public class ApiResponse<T> {

    /**
     * HTTP code
     */
    private int code;

    /**
     * message
     */
    private String message;

    /**
     * data returned
     */
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiResponse() {};

    /**
     * Success, 200, 201, with data
     */
    public static <T> ApiResponse<T> success(int code, String message,T data){
        ApiResponse<T> response = new ApiResponse<>();
        response.setCode(code);
        response.setMessage(message);
        response.setData(data);
        return response;
    }

    /**
     * Error, with data
     */
    public static <T> ApiResponse<T> error(int code, String message,T data){
        ApiResponse<T> response = new ApiResponse<>();
        response.setCode(code);
        response.setMessage(message);
        response.setData(data);
        return response;
    }

    /**
     * Error, without data
     */
    public static <T> ApiResponse<T> error(int code, String message){
        ApiResponse<T> response = new ApiResponse<>();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

}
