package com.web.pojo;

import java.math.BigDecimal;

public class Hosregister {
    private Integer hosR_id;

    private String hosR_idCar;

    private String hosR_medical;

    private BigDecimal hosR_regPrice;

    private String hosR_phone;

    private Integer hosR_selfPrice;

    private Integer hosR_sex;

    private Integer hosR_age;

    private String hosR_work;

    private Integer hosR_lookDoctor;

    private Integer d_id;

    private String hosR_remark;

    private Integer hosR_state;

    public Integer getHosR_id() {
        return hosR_id;
    }

    public void setHosR_id(Integer hosR_id) {
        this.hosR_id = hosR_id;
    }

    public String getHosR_idCar() {
        return hosR_idCar;
    }

    public void setHosR_idCar(String hosR_idCar) {
        this.hosR_idCar = hosR_idCar == null ? null : hosR_idCar.trim();
    }

    public String getHosR_medical() {
        return hosR_medical;
    }

    public void setHosR_medical(String hosR_medical) {
        this.hosR_medical = hosR_medical == null ? null : hosR_medical.trim();
    }

    public BigDecimal getHosR_regPrice() {
        return hosR_regPrice;
    }

    public void setHosR_regPrice(BigDecimal hosR_regPrice) {
        this.hosR_regPrice = hosR_regPrice;
    }

    public String getHosR_phone() {
        return hosR_phone;
    }

    public void setHosR_phone(String hosR_phone) {
        this.hosR_phone = hosR_phone == null ? null : hosR_phone.trim();
    }

    public Integer getHosR_selfPrice() {
        return hosR_selfPrice;
    }

    public void setHosR_selfPrice(Integer hosR_selfPrice) {
        this.hosR_selfPrice = hosR_selfPrice;
    }

    public Integer getHosR_sex() {
        return hosR_sex;
    }

    public void setHosR_sex(Integer hosR_sex) {
        this.hosR_sex = hosR_sex;
    }

    public Integer getHosR_age() {
        return hosR_age;
    }

    public void setHosR_age(Integer hosR_age) {
        this.hosR_age = hosR_age;
    }

    public String getHosR_work() {
        return hosR_work;
    }

    public void setHosR_work(String hosR_work) {
        this.hosR_work = hosR_work == null ? null : hosR_work.trim();
    }

    public Integer getHosR_lookDoctor() {
        return hosR_lookDoctor;
    }

    public void setHosR_lookDoctor(Integer hosR_lookDoctor) {
        this.hosR_lookDoctor = hosR_lookDoctor;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getHosR_remark() {
        return hosR_remark;
    }

    public void setHosR_remark(String hosR_remark) {
        this.hosR_remark = hosR_remark == null ? null : hosR_remark.trim();
    }

    public Integer getHosR_state() {
        return hosR_state;
    }

    public void setHosR_state(Integer hosR_state) {
        this.hosR_state = hosR_state;
    }
}