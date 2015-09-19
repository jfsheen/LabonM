package net.emole.model.literature;

import com.google.common.base.Objects;
import net.emole.model.commons.Address;
import net.emole.model.base.BaseEntity;
import net.emole.model.commons.Contact;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sjf on 15-8-31.
 */
@Entity
@Table(name = "t_article_author")
public class Author extends BaseEntity{

    @Column
    private String firstName;
    @Column
    private String middleName;
    @Column
    private String lastName;
    @Column
    private Address address;
    @ManyToMany
    private List<Company> companyList;
    @Column
    private Contact contact;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Author author = (Author) o;
        return Objects.equal(firstName, author.firstName) &&
                Objects.equal(middleName, author.middleName) &&
                Objects.equal(lastName, author.lastName) &&
                Objects.equal(address, author.address) &&
                Objects.equal(companyList, author.companyList) &&
                Objects.equal(contact, author.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), firstName, middleName, lastName, address, companyList, contact);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", companyList=" + companyList +
                ", contact=" + contact +
                '}';
    }
}
