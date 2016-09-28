package net.sunmingchun.test;

import com.mchange.v2.sql.filter.SynchronizedFilterResultSet;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 念梓  on 2016/9/22.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public class CountDownLatchUtil {


    public static void main(String[] args) {
        CountDownLatch startSinglle = new CountDownLatch(1);
    }

//    Synchroni

//    synchronized
}


class TestRun implements  Runnable{

    @Override
    public void run() {
        System.out.println("开始执行线程: "+ Thread.currentThread().getName());
    }
}
