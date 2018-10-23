package com.EurekaJdbcYj.domain;

import java.util.Date;

/**
 * 城市实体类
 *
 * Created by caijun on 10/16/2018.
 */
public class Yj {

    private String pay_id;   
    
    private String housing_add;
    
    private Date planpay_date;
    
    private Long pay_amount;

    private Long valid_flag;
    
    private Long available_flag;
    
    private Long factoring_flag;
    

    public String getId() {
        return pay_id;
    }

    public void setId(String pay_id) {
        this.pay_id = pay_id;
    }
    
        
    public String getHousing_add() {
        return housing_add;
    }

    public void setHousing_add(String housing_add) {
        this.housing_add = housing_add;
    }    
    
    public Date getPlanpay_date() {
        return planpay_date;
    }

    public void setPlanpay_date(Date planpay_date) {
        this.planpay_date = planpay_date;
    }
    
    public Long getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(Long pay_amount) {
        this.pay_amount = pay_amount;
    }
    
    public Long getValid_flag() {
        return valid_flag;
    }

    public void setValid_flag(Long valid_flag) {
        this.valid_flag = valid_flag;
    }
    
    public Long getAvailable_flag() {
        return available_flag;
    }

    public void setAvailable_flag(Long available_flag) {
        this.available_flag = available_flag;
    }
    
    public Long getFactoring_flag() {
        return factoring_flag;
    }

    public void setFactoring_flag(Long factoring_flag) {
        this.factoring_flag = factoring_flag;
    }
}