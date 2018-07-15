package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Dell on 2018/7/15.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int  provinceCode;

    public int getIdt(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
