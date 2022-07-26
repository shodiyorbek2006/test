package com.company.animal;

public class Animal {
    String pet;

    public void sound(){
        System.out.println("tuv,tow");
    }


}
class Dog extends Animal{
    String niceName;

    @Override
    public void sound() {
        System.out.println("wow ,wow");
    }

    public void show(){
        System.out.println("pet "+pet);
        System.out.println("NiceName "+niceName);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.pet="Dog";
        dog.niceName="alfa";
        dog.show();
        dog.sound();

    }
}

