package com.mynotes.utils;

import com.mynotes.model.base.ApiResponse;

public class ApiResponseUtil {

    /**
     * success with data
     */
    public static <T> ApiResponse<T> success(String message, T data){
        return ApiResponse.success(200, message, data);
    }

    /**
     * created with data
     */
    public static <T> ApiResponse<T> created(String message, T data){
        return ApiResponse.success(201, message, data);
    }

    /**
     * bad request, without data
     */
    public static <T> ApiResponse<T> badRequest(String message){
        return ApiResponse.error(400, message);
    }

    /**
     * error
     */
    public static <T> ApiResponse<T> serverError(String message){
        return ApiResponse.error(500, message);
    }

    /**
     * conflict, resouce exists already
     */
    public static <T> ApiResponse<T> conflict(String message){
        return ApiResponse.error(409, message);
    }


}
