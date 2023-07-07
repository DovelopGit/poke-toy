package com.toy.poketoy.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping("/check")
    public ApiResponse check() {
        String success = "success";
        return ApiResponse.success(success);
    }
}
