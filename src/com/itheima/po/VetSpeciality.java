package com.itheima.po;

public class VetSpeciality {
    private int vetId;
    private String specId;

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    @Override
    public String toString() {
        return "VetSpeciality{" +
                "vetId=" + vetId +
                ", specId='" + specId + '\'' +
                '}';
    }
}
