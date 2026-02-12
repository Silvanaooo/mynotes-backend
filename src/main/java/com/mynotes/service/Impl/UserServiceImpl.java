package com.mynotes.service.Impl;

import com.mynotes.model.base.ApiResponse;
import com.mynotes.model.dto.user.RegisterRequest;
import com.mynotes.model.vo.user.RegisterVO;
import com.mynotes.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    /**
     * Registration
     * - check account exist or not
     * - email validation
     * -
     * @param request
     * @return
     */

    @Override
    public ApiResponse<RegisterVO> register(RegisterRequest request) {





        return null;
    }
}
