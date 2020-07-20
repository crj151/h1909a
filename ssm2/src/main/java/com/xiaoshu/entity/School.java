package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

public class School implements Serializable {
    @Id
    @Column(name = "c_cid")
    private Integer cCid;

    @Column(name = "c_cname")
    private String cCname;

    private static final long serialVersionUID = 1L;

    /**
     * @return c_cid
     */
    public Integer getcCid() {
        return cCid;
    }

    /**
     * @param cCid
     */
    public void setcCid(Integer cCid) {
        this.cCid = cCid;
    }

    /**
     * @return c_cname
     */
    public String getcCname() {
        return cCname;
    }

    /**
     * @param cCname
     */
    public void setcCname(String cCname) {
        this.cCname = cCname == null ? null : cCname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cCid=").append(cCid);
        sb.append(", cCname=").append(cCname);
        sb.append("]");
        return sb.toString();
    }
}