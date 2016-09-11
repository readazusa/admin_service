package net.sunmingchun.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by ty on 2016/9/10.
 */
public class FT {
    public static void main(String[] args) throws Exception {
        File file = new File("G:/own_application/java_application/admin_service/target/classes/fdfs_client.conf");


        FileReader reader = new FileReader(file);
        BufferedReader bb = new BufferedReader(reader);

        String str = null;
        while((str = bb.readLine()) != null){
            System.out.println(str);
        }

    }
}
