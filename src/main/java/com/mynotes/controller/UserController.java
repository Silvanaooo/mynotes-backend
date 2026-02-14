package com.mynotes.controller;

import com.mynotes.model.base.ApiResponse;
import com.mynotes.model.dto.user.RegisterRequest;
import com.mynotes.model.vo.user.RegisterVO;
import com.mynotes.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //base path
public class UserController {

    @Autowired
    private UserService userService; //use user service interface

    /**
     * User registration
     * @param request
     * @return
     */
    @PostMapping("/users")
    ResponseEntity<ApiResponse<RegisterVO>> register(
            @Valid
            @RequestBody
            RegisterRequest request
    ){
        // call service layer and get ApiResponse
        // res to get response body and http code
        ApiResponse<RegisterVO> res = userService.register(request);
        // use ResponseEntity to return the real code, if just return res, Spring will always give 200 by default
        // therefore, HTTP status: res.code, response body: res (JSON)
        return ResponseEntity.status(HttpStatus.valueOf(res.getCode())).body(res);
    }


}
