package com.api.chat_with_me.controllers;

import com.api.chat_with_me.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<ResponseDto> teste() {
        return ResponseEntity.ok(new ResponseDto("hello world", HttpStatus.OK.value()));
    }

}
