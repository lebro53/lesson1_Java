package ru.sssii.java.api.OOP2.HomeWork;

public class Cat implements Sport{
    private String name;

    private Integer maxJump;
    private Integer maxRunDistance;

    public Cat(String name, Integer maxJump, Integer maxRunDistance) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRunDistance = maxRunDistance;
    }



    @Override
    public String jump(Wall height) {
        if(height.getHeightWall()>maxJump){
            return ("Кот по имени " + name + " НЕ смог перепрыгнуть стену высотой " + height.getHeightWall() +
                    " метров. Поэтому он выбывает с соревнований.");
        }else {
            return ("Кот по имени " + name + " смог перепрыгнуть стену высотой " + height.getHeightWall());
        }
    }

    @Override
    public String run(Treadmill length) {
        if(length.getLengthTreadmill()>maxRunDistance){
            return ("Кот по имени " + name + " НЕ смог пробежать " + length.getLengthTreadmill() +
                    " метров. Поэтому он выбывает с соревнований.");
        }else {
            return ("Кот по имени " + name + " смог пробежать " + length.getLengthTreadmill() + " км.");
        }
    }

}
