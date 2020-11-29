package com.szx.pojo;


// 种类类

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {

    private Long id;        // 主键

    private String name;    // 种类名称

    private List<Blog> blogs = new ArrayList<>();   // 一个种类对应多个Blog

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
