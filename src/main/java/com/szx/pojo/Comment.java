package com.szx.pojo;

// 评论类

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    private Long id;            // 主键

    private String nickname;    // 昵称

    private String email;       // 邮箱

    private String content;     // 评论内容

    private String avatar;      // 头像

    private Date createTime;    // 评论时间

    private Blog blog;          // 评论所属的Blog

    private List<Comment> replyComments = new ArrayList<>();    // 该评论的子类对象

    private Comment parentComment;                              // 该评论对应的父类

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", createTime=" + createTime +
                ", blog=" + blog +
                ", replyComments=" + replyComments +
                '}';
    }
}
