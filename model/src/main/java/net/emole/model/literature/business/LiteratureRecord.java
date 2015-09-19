package net.emole.model.literature.business;

import net.emole.model.literature.Literature;
import net.emole.model.commons.constant.PersonRole;
import net.emole.model.base.BaseEntity;
import net.emole.model.member.Person;

import javax.persistence.Column;

/**
 * Created by sjf on 15-9-14.
 */
public class LiteratureRecord extends BaseEntity{

    @Column
    private Literature literature;
    @Column
    private Person person;
    @Column
    private PersonRole personRole;
 /*   @Column
    private */
}
