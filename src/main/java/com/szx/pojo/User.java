package com.szx.pojo;

// 用户实体类

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;            // 主键

    private String nickname;    // 昵称

    private String username;    // 用户名

    private String password;    // 密码

    private String email;       // 邮箱

    private String avatar;      // 用户头像

    private Integer type;       // 用户类型

    private Date createTime;    // 注册时间

    private Date updateTime;    //更新时间

    private List<Blog> blogs = new ArrayList<>();   // 用户写的博客


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", type=" + type +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
