package javabasic.java_lecture.poly.ex5;

public class Cow implements InterfaceAnimal{
    @Override
    public void sound(){
        System.out.println("음매");
    }

    @Override
    public void move(){
        System.out.println("소가 움직입니다.");
    }
}