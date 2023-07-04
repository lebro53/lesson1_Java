package ru.sssii.java.api.OOP1.Seminar1.Task1;

public class Cat extends Animal {

    private String color;
    private Integer age;



    public Cat(String name,String color, Integer age) {
        super(name);
        this.color = color;
        if(age>0) {
            this.age = age;
        } else {
            System.out.println("Возраст введен не корректно");
        };
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public void animalInfo() {
        System.out.println("Животное по кличке: " + super.getName() + " цвета " + getColor() + " с возрастом " + getAge());
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age>0) {
            this.age = age;
        } else {
            System.out.println("Возраст введен не корректно");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
