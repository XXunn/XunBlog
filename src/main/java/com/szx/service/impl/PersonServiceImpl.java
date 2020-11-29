package com.szx.service.impl;

import com.szx.dao.PersonDao;
import com.szx.pojo.Person;
import com.szx.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonDao personDao;

    @Override
    public List<Person> getAllPerson() {
        return this.personDao.getAllPerson();
    }
}
