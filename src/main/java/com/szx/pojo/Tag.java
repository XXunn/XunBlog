package com.szx.pojo;

// 标签类

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tag {

    private Long id;        // 主键

    private String name;    // 标签名称

    private List<Blog> blogs = new ArrayList<>();   // 一个标签也可以对应多个Blog

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
