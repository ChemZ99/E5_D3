package Exercises.E5_D3.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drink {
    private String name;
    private String qt;
    private int calories;
    private double price;
}
