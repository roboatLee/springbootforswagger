package com.lee.dao;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class User {
    @Schema(name = "用户ID",example = "000001",requiredMode = Schema.RequiredMode.REQUIRED)
    private Long id;
    @Schema(name="用户名字",example = "李德文",requiredMode = Schema.RequiredMode.REQUIRED)
    private String username;
    @Schema(name = "用户邮箱",example = "email",requiredMode = Schema.RequiredMode.REQUIRED)
    private String email;
    public User(Long id, String username, String email){
        this.id=id;
        this.email =email;
        this.username = username;
    }
}
