package net.sunmingchun.test;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by 念梓  on 2016/9/26.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public class TestThreadLocal {

    private static  ThreadLocal<Integer> threadLocal = new ThreadLocal<>();


    public static void main(String[] args) {
        threadLocal.set(4);
        threadLocal.get();

        Map<String,String> map = new HashMap<>();
    }







}
