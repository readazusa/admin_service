package net.sunmingchun.test;




import java.io.*;

/**
 * Created by ty on 2016/9/10.
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
//        InputStream inputStream = FileTest.class.getClassLoader().getResourceAsStream("fdfs_client.conf");
//
//
//        System.out.println(FileTest.class.getClassLoader().getResource("fdfs_client.conf").getFile());
//
//        InputStreamReader reader = new InputStreamReader(inputStream);
//        int a =0;
//
//        BufferedReader bb = new BufferedReader(reader);
//
//        String str = null;
//        while((str = bb.readLine()) != null){
//            System.out.println(str);
//        }


        File file = new File("e:"+File.separator+"123"+File.separator+"3333.xx");
        System.out.println(file.getPath());




    }
}
