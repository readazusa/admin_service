package net.sunmingchun.test;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by 念梓  on 2016/9/27.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public class Java8Test {

    public static void main(String[] args) {

       long count =  Stream.of(new User("smc","smc"),new User("ty","ty"),new User("st","st")).filter(e->{
            System.out.println(e);
            return e.getPassword().equals("smc");
        }).count();
        System.out.println("count: "+ count);

        User max = Stream.of(new User("smc","smc"),new User("ty","ty"),new User("st","st")).max(Comparator.comparing(e->e.username)).get();
        long l= Stream.of("123","456","123").distinct().count();
        System.out.println("l: "+ l);
    }


    static class User{

        private String username;

        private String password;

        public User(String username,String password){
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
}
