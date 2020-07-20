package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable {
    @Id
    @Column(name = "s_id")
    private Integer sId;

    @Column(name = "s_name")
    private String sName;

    @Column(name = "s_create")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date sCreate;

    @Column(name = "s_age")
    private String sAge;

    @Column(name = "s_sex")
    private String sSex;

    @Column(name = "s_cid")
    private Integer sCid;

    private static final long serialVersionUID = 1L;

    /**
     * @return s_id
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * @param sId
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * @return s_name
     */
    public String getsName() {
        return sName;
    }

    /**
     * @param sName
     */
    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    /**
     * @return s_create
     */
    public Date getsCreate() {
        return sCreate;
    }

    /**
     * @param sCreate
     */
    public void setsCreate(Date sCreate) {
        this.sCreate = sCreate;
    }

    /**
     * @return s_age
     */
    public String getsAge() {
        return sAge;
    }

    /**
     * @param sAge
     */
    public void setsAge(String sAge) {
        this.sAge = sAge == null ? null : sAge.trim();
    }

    /**
     * @return s_sex
     */
    public String getsSex() {
        return sSex;
    }

    /**
     * @param sSex
     */
    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    /**
     * @return s_cid
     */
    public Integer getsCid() {
        return sCid;
    }

    /**
     * @param sCid
     */
    public void setsCid(Integer sCid) {
        this.sCid = sCid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", sName=").append(sName);
        sb.append(", sCreate=").append(sCreate);
        sb.append(", sAge=").append(sAge);
        sb.append(", sSex=").append(sSex);
        sb.append(", sCid=").append(sCid);
        sb.append("]");
        return sb.toString();
    }
}