package ru.sssii.java.api.OOP2.Seminar.Task1;

public class Dog extends Animal{
    private String color;
    private Integer age;

    public Dog(String name, String color, Integer age) {
        super(name);
        this.color = color;
        if(age>0) {
            this.age = age;
        } else {
            System.out.println("Возраст введен не корректно");
        };
    }

    public Dog() {

    }

    @Override
    public void animalInfo() {
        System.out.println("Собака с именем " + super.getName());
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
        this.age = age;
    }
    public void voice(){
        System.out.println("GAv- gav- motherfucker");
    }
}
