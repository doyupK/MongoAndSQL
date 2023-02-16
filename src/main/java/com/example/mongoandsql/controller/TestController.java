package com.example.mongoandsql.controller;

import com.example.mongoandsql.dto.TestReqDto;
import com.example.mongoandsql.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;


    @PostMapping("post")
    public ResponseEntity<?> post(@RequestBody TestReqDto testReqDto){
        return testService.post(testReqDto);

    }
}
