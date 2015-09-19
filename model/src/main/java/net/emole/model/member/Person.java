package net.emole.model.member;

import com.google.common.base.Objects;
import net.emole.model.base.BaseEntity;
import net.emole.model.commons.Address;
import net.emole.model.commons.Contact;
import net.emole.model.commons.constant.Gender;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by sjf on 15-8-31.
 */

@Entity
@Table(name = "t_member_person")
public class Person extends BaseEntity {

    @Column
    private String name;
    @Column
    private Gender gender;
    @Column
    private Date birthday;
    @Column
    private Contact contact;
    @Column
    private Address address;


}
