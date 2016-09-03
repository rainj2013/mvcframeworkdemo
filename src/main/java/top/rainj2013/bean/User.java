package top.rainj2013.bean;

/**
 * Created by rainj2013 on 16-9-2.
 */
public class User {
    private String name;
    private Integer age;
    private Boolean male;

    @Override
    public String toString() {
        return getName() + "  " + getAge() +"  " + getMale();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }
}
