package net.emole.model.literature;

import com.google.common.base.Objects;
import net.emole.model.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by sjf on 15-9-14.
 */

@Entity
@Table(name = "t_article_journal")
public class Journal extends BaseEntity{
    @Column
    private String fn;
    @Column
    private String fo;
    @Column
    private String sn;
    @Column
    private String pb;
    @Column
    private String country;

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getFo() {
        return fo;
    }

    public void setFo(String fo) {
        this.fo = fo;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Journal journal = (Journal) o;
        return Objects.equal(fn, journal.fn) &&
                Objects.equal(fo, journal.fo) &&
                Objects.equal(sn, journal.sn) &&
                Objects.equal(pb, journal.pb) &&
                Objects.equal(country, journal.country);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), fn, fo, sn, pb, country);
    }

    @Override
    public String toString() {
        return "Journal{" +
                "fn='" + fn + '\'' +
                ", fo='" + fo + '\'' +
                ", sn='" + sn + '\'' +
                ", pb='" + pb + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
