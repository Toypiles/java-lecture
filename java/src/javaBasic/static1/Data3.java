package javaBasic.static1;

public class Data3 {
    public String name;
    public static int count;

    public Data3(String name){
        this.name = name;
        Data3.count++;
    }
}
