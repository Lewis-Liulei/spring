package dao;

import org.springframework.stereotype.Repository;
import pojo.Person;

@Repository
public interface PersonMapper {

    public Person getPersonById(String id);
}
