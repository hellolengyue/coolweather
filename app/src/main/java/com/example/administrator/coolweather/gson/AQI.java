package com.example.administrator.coolweather.gson;

/**
 * @author hel
 * @date 2018/6/27
 * 文件 CoolWeather
 * 描述
 */

public class AQI {
    public AQICity city;
    public class  AQICity{
        public String aqi;
        public String pm25;
    }
}
