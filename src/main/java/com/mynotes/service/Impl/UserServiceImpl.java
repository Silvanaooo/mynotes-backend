package com.mynotes.service.Impl;

import com.mynotes.mapper.UserMapper;
import com.mynotes.model.base.ApiResponse;
import com.mynotes.model.dto.user.RegisterRequest;
import com.mynotes.model.entity.User;
import com.mynotes.model.vo.user.RegisterVO;
import com.mynotes.service.UserService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

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

        // 1. check if user exists or not
        User existingUser = userMapper.findByAccount(request.getAccount());

        if (existingUser != null)





        return null;
    }
}
