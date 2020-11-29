package com.szx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 核心: 博客类

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

    private Long id;                    // 主键

    private String title;               // 博客名称

    private String content;             // 博客内容

    private String firstPicture;        // 首图地址OR编码？

    private String flag;                // 标记类型 (转载/原创??)

    private Integer views;              // 浏览次数

    private boolean appreciationSwitch;// 赞赏按钮开关

    private boolean shareSwitch;        // 转载声明是否开启

    private boolean commentSwitch;      // 是否开启评论功能

    private boolean recommendSwitch;    // 是否推荐

    private boolean published;          // 是否发布(不发布存为草稿)

    private Date createTime;            // 创建时间

    private Date updateTime;            // 更新时间

    private Type type;                  // Blog对应的种类(一个Blog对应一个种类)

    private List<Tag> tags = new ArrayList<>(); // Blog对应的标签(一个Blog对应多个标签)

    private User user;                  // 一篇Blog只能是一个人写的

    List<Comment> comments  = new ArrayList<>();    // Blog种的评论

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", firstPicture='" + firstPicture + '\'' +
                ", flag='" + flag + '\'' +
                ", views=" + views +
                ", appreciationSwitch=" + appreciationSwitch +
                ", shareSwitch=" + shareSwitch +
                ", commentSwitch=" + commentSwitch +
                ", recommendSwitch=" + recommendSwitch +
                ", published=" + published +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
