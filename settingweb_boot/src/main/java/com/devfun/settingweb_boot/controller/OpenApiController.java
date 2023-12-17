// OpenApiController.java
package com.devfun.settingweb_boot.controller;

import com.devfun.settingweb_boot.service.OpenApiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class OpenApiController {

    private final OpenApiService openApiService;

    // 생성자를 통한 의존성 주입
    public OpenApiController(OpenApiService openApiService) {
        this.openApiService = openApiService;
    }

    @GetMapping("/holiday")
    public ResponseEntity<?> getHolidayController() throws IOException {
        return ResponseEntity.ok(openApiService.getHolidayService());
    }
}
