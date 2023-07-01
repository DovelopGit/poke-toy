package com.toy.poketoy.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class checkController {

    @GetMapping("/check")
    public ApiResponse check() {
        return ApiResponse.noContent();
    }
}
