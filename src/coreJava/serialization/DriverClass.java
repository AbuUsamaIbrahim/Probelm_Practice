package coreJava.serialization;

import java.io.*;

public class DriverClass {


   public static void main(String[] args){
       DemoClass demoClass = new DemoClass(10,"Hello World");
       String fileName = "test.txt";
       //        Serialization
       try {
           FileOutputStream fileOutputStream = new FileOutputStream(fileName);
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
           objectOutputStream.writeObject(demoClass);
           objectOutputStream.close();
           fileOutputStream.close();
           System.out.println("Object is serialized");
       }catch (IOException e){
            System.out.println("IOException occurred");
       }
       DemoClass demoClass1 = null;
       try {
           FileInputStream fileInputStream = new FileInputStream(fileName);
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           demoClass1 = (DemoClass)objectInputStream.readObject();
           objectInputStream.close();
           fileInputStream.close();
           System.out.println("Object is deSerialized");
           System.out.println("a = "+demoClass1.a);
           System.out.println("b = "+demoClass1.b);
       }catch (IOException e){
           System.out.println("IOException occurred");
       }
       catch (ClassNotFoundException e){
           System.out.println("ClassNotFoundException");
       }
   }
}
