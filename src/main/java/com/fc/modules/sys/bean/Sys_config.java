package com.fc.modules.sys.bean;

import java.io.Serializable;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

/**
 * Created by Wizzer.cn on 2015/7/1.
 */
@Table("sys_config")
public class Sys_config implements Serializable {
    private static final long serialVersionUID = 1L;
    @Name
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 100)
    private String cname;
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 100)
    private String cvalue;
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 255)
    private String note;
    @Column
    private int location;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCvalue() {
        return cvalue;
    }

    public void setCvalue(String cvalue) {
        this.cvalue = cvalue;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

}