package com.haihai.selfwriting01.bean;

public class Emp {
    private int eid;
    private String ename;

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Emp(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public Emp() {
    }
}
