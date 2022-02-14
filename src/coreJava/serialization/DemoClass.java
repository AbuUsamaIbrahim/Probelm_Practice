package coreJava.serialization;

import java.io.Serializable;

public class DemoClass implements Serializable {
    public int a;
    public String b;

    public DemoClass(int a, String b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
