package Exercises.E5_D3.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Topping {
    private String name;
    private int calories;
    private double price;
}
