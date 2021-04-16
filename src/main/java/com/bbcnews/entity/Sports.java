package com.bbcnews.entity;

import javax.persistence.*;

@Entity
@Table(name = "sports")
public class Sports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sportsid")
    int sportsid;
    @Column(name = "categorynameid")
    int categorynameid;
    @Column(name = "sportsname")
    String sportsname;

    public Sports() {
    }

    public Sports(int categoryNameId, String sportsName) {
        this.categorynameid = categoryNameId;
        this.sportsname = sportsName;
    }

    public int getSportsid() {
        return sportsid;
    }

    public void setSportsid(int sportsid) {
        this.sportsid = sportsid;
    }

    public int getCategorynameid() {
        return categorynameid;
    }

    public void setCategorynameid(int categorynameid) {
        this.categorynameid = categorynameid;
    }

    public String getSportsname() {
        return sportsname;
    }

    public void setSportsname(String sportsname) {
        this.sportsname = sportsname;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "sportsId=" + sportsid +
                ", categoryNameId=" + categorynameid +
                ", sportsName='" + sportsname + '\'' +
                '}';
    }
}
