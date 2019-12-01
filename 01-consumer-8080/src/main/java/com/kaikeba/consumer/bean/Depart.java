package com.kaikeba.consumer.bean;

/**
 * @author fyl
 * @data
 **/
public class Depart {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDbase() {
        return dbase;
    }

    public void setDbase(String dbase) {
        this.dbase = dbase;
    }

    private Integer id;
    private  String name;
    private  String dbase;

}
