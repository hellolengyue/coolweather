package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author hel
 * @date 2018/6/27
 * 文件 CoolWeather
 * 描述
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecase> forecaseList;
}
