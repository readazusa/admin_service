package net.sunmingchun.test;

import java.util.stream.Stream;

/**
 * Created by 念梓  on 2016/9/18.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public class AddStrreamTest {

    public static void main(String[] args) {
        long count = Stream.of(23,12,56).count();

        int sum = Stream.of(23,12,56).reduce(0,(a,b)->a+b);
        System.out.println("count: "+ count);
        System.out.println("sum: "+ sum);
    }

}
