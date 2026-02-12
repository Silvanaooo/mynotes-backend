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


}
