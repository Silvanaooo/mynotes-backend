package com.mynotes.service.Impl;

import com.mynotes.mapper.UserMapper;
import com.mynotes.model.base.ApiResponse;
import com.mynotes.model.dto.user.RegisterRequest;
import com.mynotes.model.entity.User;
import com.mynotes.model.vo.user.RegisterVO;
import com.mynotes.service.UserService;
import com.mynotes.utils.ApiResponseUtil;
import org.apache.ibatis.jdbc.Null;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

//    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
//        this.passwordEncoder = passwordEncoder;
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
    @Transactional(rollbackFor = Exception.class)
    public ApiResponse<RegisterVO> register(RegisterRequest request) {

        // 1. check if user exists or not
        User existingUser = userMapper.findByAccount(request.getAccount());

        if (existingUser != null) {
            return ApiResponseUtil.conflict("account already exists");
//            throw new HttpClientErrorException(HttpStatus.CONFLICT); // error handling method, use it later
        }

        // 2. check email
        if (request.getEmail() != null && !request.getEmail().isBlank()) {
            User byEmail = userMapper.findByEmail(request.getEmail());
            if (byEmail != null) {
                return ApiResponseUtil.conflict("email already exists");
            }
        }

        // 3. create new user
        User newUser = new User();
        newUser.setAccount(request.getAccount());
        newUser.setUsername(request.getUsername());
        newUser.setEmail(request.getEmail());

        // 3.1 hashed passowrd
//        newUser.setPassword(passwordEncoder.encode(request.getPassword()));

        newUser.setPassword(request.getPassword());

        // 3.2 timestamp
        LocalDateTime now = LocalDateTime.now();
        newUser.setCreateAt(now);
        newUser.setUpdateAt(now);

        // 3.3 insert
        userMapper.insert(newUser);
        // 3.4 returned VO
        RegisterVO registerVO = new RegisterVO();
        registerVO.setUserId(newUser.getUserId());

        return ApiResponseUtil.created("User created successfully", registerVO);

//        try {
//            // 3.3 insert
//            userMapper.insert(newUser);
//            // 3.4 returned VO
//            RegisterVO registerVO = new RegisterVO();
//
//            return ApiResponseUtil.created("User created successfully", registerVO);
//
//        } catch (Exception e) {
//            return ApiResponseUtil.serverError("register failed");
//        }
//    }
    }
}
