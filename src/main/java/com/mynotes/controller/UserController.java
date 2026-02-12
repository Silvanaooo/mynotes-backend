package com.mynotes.controller;

import com.mynotes.model.base.ApiResponse;
import com.mynotes.model.dto.user.RegisterRequest;
import com.mynotes.model.vo.user.RegisterVO;
import com.mynotes.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //base path
public class UserController {

    @Autowired
    private UserService userService; //use user service interface

    @PostMapping
    public ApiResponse<RegisterVO> register(
            @Valid
            @RequestBody
            RegisterRequest request
    ){
        return userService.register(request);
    }






}
