package ru.sssii.java.api.Seminar3.Task3and4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Task3and4 {
    /**
     * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
     * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
     * Найти:
     * - количество кубиков желтого цвета и их суммарный объем;
     * - количество деревянных кубиков с ребром 3 см
     *
     * @param args
     */
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "yellow", "wood");
        Cube cube2 = new Cube(5, "yellow", "metal");
        Cube cube3 = new Cube(32, "red", "polimer");
        Cube cube4 = new Cube(3, "white", "wood");
        Cube cube5 = new Cube(3, "white", "wood");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        cubeList.add(cube5);
        int cntYellow = 0;
        int sumVolume = 0;
        int cntWood = 0;
        for (Cube cube : cubeList
        ) {
            if (cube.getColor().equals("yellow")) {
                cntYellow += 1;
                sumVolume += cube.volumeCube();
            }
            if (cube.getSize() == 3 && cube.getMaterial().equals("wood")) {
                cntWood += 1;
            }

        }
        System.out.println("cntYellow = " + cntYellow);
        System.out.println("sumVolume = " + sumVolume);
        System.out.println("cntWood = " + cntWood);
        System.out.println("unicCollection(cubeList) = " + unicCollection(cubeList));
    }

    private static Collection unicCollection(List<Cube> cubeList) {
        return new HashSet(cubeList);
    }
}
