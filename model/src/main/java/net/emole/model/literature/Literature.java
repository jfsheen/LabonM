package net.emole.model.literature;

import com.google.common.base.Objects;
import net.emole.model.commons.constant.LiteratureType;
import net.emole.model.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by sjf on 15-8-31.
 */

@Entity
@Table(name = "t_article")
public class Literature extends BaseEntity {

    @Column
    private String title;
    @Column
    private LiteratureType type;
    @ManyToMany()
    private List<Author> authorList;
    @Column
    private String doi;
    @Column
    private String url;
    @Column
    private Journal journal;
    @Column
    private Date dateOnWeb;
    @Column
    private Integer year;
    @Column
    private Integer volume;
    @Column
    private Integer issue;
    @Column
    private String startPage;
    @Column
    private String endPage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LiteratureType getType() {
        return type;
    }

    public void setType(LiteratureType type) {
        this.type = type;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public Date getDateOnWeb() {
        return dateOnWeb;
    }

    public void setDateOnWeb(Date dateOnWeb) {
        this.dateOnWeb = dateOnWeb;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getIssue() {
        return issue;
    }

    public void setIssue(Integer issue) {
        this.issue = issue;
    }

    public String getStartPage() {
        return startPage;
    }

    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

    public String getEndPage() {
        return endPage;
    }

    public void setEndPage(String endPage) {
        this.endPage = endPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Literature literature = (Literature) o;
        return Objects.equal(title, literature.title) &&
                Objects.equal(type, literature.type) &&
                Objects.equal(authorList, literature.authorList) &&
                Objects.equal(doi, literature.doi) &&
                Objects.equal(url, literature.url) &&
                Objects.equal(journal, literature.journal) &&
                Objects.equal(dateOnWeb, literature.dateOnWeb) &&
                Objects.equal(year, literature.year) &&
                Objects.equal(volume, literature.volume) &&
                Objects.equal(issue, literature.issue) &&
                Objects.equal(startPage, literature.startPage) &&
                Objects.equal(endPage, literature.endPage);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), title, type, authorList, doi, url, journal, dateOnWeb, year, volume, issue, startPage, endPage);
    }

    @Override
    public String toString() {
        return "Literature{" +
                "title='" + title + '\'' +
                ", type=" + type +
                ", authorList=" + authorList +
                ", doi='" + doi + '\'' +
                ", url='" + url + '\'' +
                ", journal=" + journal +
                ", dateOnWeb=" + dateOnWeb +
                ", year=" + year +
                ", volume=" + volume +
                ", issue=" + issue +
                ", startPage='" + startPage + '\'' +
                ", endPage='" + endPage + '\'' +
                '}';
    }
}
