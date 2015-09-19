package net.emole.model.member;

import net.emole.model.base.BaseEntity;

import javax.persistence.Column;
import java.util.Date;

/**
 * Created by sjf on 15-9-19.
 */
public class Account extends BaseEntity {
    @Column
    private String account;
    @Column
    private String nickname;
    @Column
    private String username;
    @Column
    private String encodedPsw;
    @Column
    private Date validDate;
    @Column
    private Integer validSeconds;
    @Column
    private String status;


}
