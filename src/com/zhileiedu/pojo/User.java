package com.zhileiedu.pojo;

public class User {
    private  int id;
    private String yewu;
    private String diyiname;

    public User() {
    }

    public User(int id, String yewu, String diyiname) {
        this.id = id;
        this.yewu = yewu;
        this.diyiname = diyiname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYewu() {
        return yewu;
    }

    public void setYewu(String yewu) {
        this.yewu = yewu;
    }

    public String getDiyiname() {
        return diyiname;
    }

    public void setDiyiname(String diyiname) {
        this.diyiname = diyiname;
    }

    @Override
    public String toString() {
        return this.diyiname+"--"+this.yewu+"--"+this.id;
    }

}
