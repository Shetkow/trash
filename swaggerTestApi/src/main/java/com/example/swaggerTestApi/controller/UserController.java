package com.example.swaggerTestApi.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("api/user/point")
@Tag(name = "Система лояльности", description = "Управляет балами пользователей")
public class UserController {
    @GetMapping
    public String hello(){
        return "hi";
    }

}
