package com.szx.dao;

import com.szx.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonDao {
    // 查询所有用户
    List<Person> getAllPerson();
}
