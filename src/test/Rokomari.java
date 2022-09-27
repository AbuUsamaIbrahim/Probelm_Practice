package test;

import org.apache.catalina.LifecycleState;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Rokomari {
    public static void main(String [] args) throws IOException {
        List<Integer>integerList = new ArrayList<>(10);
        for(int i=0;i<8;i++){
            integerList.add(i);
        }
        String s1 = "hello";
        String s2 = new String("hello");
        String s4 = new String("hello");
        String s3 = "hello";
        if(s2 == s4){
            System.out.println("true");
        }else{
            System.out.println("false");
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
        }
        if(s1 == s3){
            System.out.println("true");
            System.out.println(s1.hashCode());
            System.out.println(s3.hashCode());
        }else{
            System.out.println("false");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s  = reader.readLine();
        String rs= "";
        StringBuilder stringBuilder = new StringBuilder();
         rs = stringBuilder.append(s).reverse().toString();

        if(rs.equals(s))
            System.out.println("p");
        else{
            System.out.println("np");
        }
        integerList.forEach(integer -> System.out.println(integer));
    }

}
