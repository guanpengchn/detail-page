package com.drawcode.detail.service;

public class RateAbility extends BaseAbility {

    @Override
    public void init() {
        try {
            Thread.sleep(2000);// 主线程每隔1秒钟，打印当前时钟时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        data = "；评分";
    }
}
