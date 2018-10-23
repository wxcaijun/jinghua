package com.EurekaJdbcScs.domain;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * 供应商实体类
 *
 * Created by caijun on 10/16/2018.
 */
public class Scs {

    /**
     * 场编
     */
    private Long vender_id;

    /**
     * 应付帐统计日期
     */
    private Date acc_date;

    /**
     * 已对账已开票未支付
     */
    private BigDecimal invoice_amt;

    /**
     * 
     */
    private BigDecimal k_amt;
    
    /**
     * 付款区间
     */
    private Long plan_pay_interval;
    
    /**
     * 更新数据时间
     */
    private Date update_time;
    
    /**
     * 失效期
     */
    private Date exp_date;

    public Long getId() {
        return vender_id;
    }

    public void setId(Long vender_id) {
        this.vender_id = vender_id;
    }
    
    public Date getAcc_date() {
        return acc_date;
    }

    public void setAcc_date(Date acc_date) {
        this.acc_date = acc_date;
    }
    
    public BigDecimal getInvoice_amt() {
        return invoice_amt;
    }

    public void setInvoice_amt(BigDecimal invoice_amt) {
        this.invoice_amt = invoice_amt;
    }
    
    public BigDecimal getK_amt() {
        return k_amt;
    }

    public void setK_amt(BigDecimal k_amt) {
        this.k_amt = k_amt;
    }
    
    public Long getPlan_pay_interval() {
        return plan_pay_interval;
    }

    public void setPlan_pay_interval(Long plan_pay_interval) {
        this.plan_pay_interval = plan_pay_interval;
    }
    
    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
    
    public Date getExp_date() {
        return exp_date;
    }

    public void setExp_date(Date exp_date) {
        this.exp_date = exp_date;
    }

    
}