package ru.sssii.java.api.OOP2.HomeWork;

public class Main {
    public static void main(String[] args) {
        Sport[] sportsmen = {
                new Human("Artem", 50, 13),
                new Robot("R2-D2", 500000, 500000),
                new Cat("Cat", 90, 33),
        };

        Obstacles[] obstacles = {
                new Obstacles(new Treadmill(10), new Wall(6)),
                new Obstacles(new Treadmill(14), new Wall(40))
        };


        runWithObstacles(sportsmen, obstacles);

    }

    private static void runWithObstacles(Sport[] sportsmen, Obstacles[] obstacles) {
        for (int i = 0; i < sportsmen.length; i++) {
            for (Obstacles o : obstacles) {
                if(!sportsmen[i].jump(o.getHeight()).contains("НЕ")){
                    System.out.println(sportsmen[i].jump(o.getHeight()));
                    if(!sportsmen[i].run(o.getLength()).contains("НЕ")){
                        System.out.println(sportsmen[i].run(o.getLength()));
                    }
                    else {
                        System.out.println(sportsmen[i].run(o.getLength()));
                        break;
                    }
                } else{
                    System.out.println(sportsmen[i].jump(o.getHeight()));
                    break;
                }
            }
        }
    }
}
