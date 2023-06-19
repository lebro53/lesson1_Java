package ru.sssii.java.api.Seminar3.Task3and4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Cube {
    private Integer size;
    private String color;
    private String material;


    public Integer volumeCube() {
        return size * size * size;
    }
}
