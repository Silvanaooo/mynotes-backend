package com.mynotes.service;

import com.mynotes.model.base.ApiResponse;
import com.mynotes.model.dto.user.RegisterRequest;
import com.mynotes.model.vo.user.RegisterVO;

public interface UserService {
    /**
     * registration
     *
     * @param request
     * @return
     */
    ApiResponse<RegisterVO> register(RegisterRequest request);
}
