package net.emole.model.literature;

import com.google.common.base.Objects;
import net.emole.model.commons.Address;
import net.emole.model.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by sjf on 15-8-31.
 */
@Entity
@Table(name = "t_article_author_company")
public class Company extends BaseEntity{

    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Company company = (Company) o;
        return Objects.equal(name, company.name) &&
                Objects.equal(address, company.address);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), name, address);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
