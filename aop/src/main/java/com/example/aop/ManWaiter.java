package com.example.aop;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/7/22 20:12
 */
public class ManWaiter implements Waiter {
    @Override
    public void server() {
        System.out.println("服务中...");
    }
}
