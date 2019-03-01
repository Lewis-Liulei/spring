package liulei.controller.pojo;

public class Person {
    private String name;
    private String id;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person() {

    }

    public Person(String name, String id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
