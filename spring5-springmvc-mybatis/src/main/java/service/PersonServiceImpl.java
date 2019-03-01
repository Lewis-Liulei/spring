package service;

import dao.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Person;

import javax.annotation.Resource;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public Person getPersonById(String id) {
        return personMapper.getPersonById(id);
    }
}
