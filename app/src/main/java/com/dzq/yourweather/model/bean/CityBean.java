package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class CityBean {
//    "aqi": "60",
//    "co": "0",
//    "no2": "14",
//    "o3": "95",
//    "pm10": "67",
//    "pm25": "15",
//    "qlty": "良",  //共六个级别，分别：优，良，轻度污染，中度污染，重度污染，严重污染
//    "so2": "10"

    private String aqi;
    private String co;
    private String no2;
    private String o3;
    private String pm10;
    private String pm25;
    private String qlty;
    private String so2;

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getQlty() {
        return qlty;
    }

    public void setQlty(String qlty) {
        this.qlty = qlty;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    @Override
    public String toString() {
        return "CityBean{" +
                "aqi='" + aqi + '\'' +
                ", co='" + co + '\'' +
                ", no2='" + no2 + '\'' +
                ", o3='" + o3 + '\'' +
                ", pm10='" + pm10 + '\'' +
                ", pm25='" + pm25 + '\'' +
                ", qlty='" + qlty + '\'' +
                ", so2='" + so2 + '\'' +
                '}';
    }
}
