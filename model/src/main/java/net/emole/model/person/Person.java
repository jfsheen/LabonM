package net.emole.model.person;

import com.google.common.base.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by sjf on 15-8-31.
 */

@Entity
@Table(name = "t_person")
public class Person implements Serializable{
    private Long id;
    private String name;
    private Boolean gender;
    private Date birthday;
    private Date time_of_record;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getTime_of_record() {
        return time_of_record;
    }

    public void setTime_of_record(Date time_of_record) {
        this.time_of_record = time_of_record;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equal(id, person.id) &&
                Objects.equal(name, person.name) &&
                Objects.equal(gender, person.gender) &&
                Objects.equal(birthday, person.birthday) &&
                Objects.equal(time_of_record, person.time_of_record);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, gender, birthday, time_of_record);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", time_of_record=" + time_of_record +
                '}';
    }
}
