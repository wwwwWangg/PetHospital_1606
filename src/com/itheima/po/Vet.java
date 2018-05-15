package com.itheima.po;

import ph.po.Speciality;

import java.util.ArrayList;
import java.util.List;

public class Vet
{
    private int id;
    private String name;
    private List<Speciality> specs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Vet{" +
                "id=" + id +
                ", name='" + name + '\''+
                '}';
    }
}
