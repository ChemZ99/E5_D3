package Exercises.E5_D3.entities;


import lombok.Data;

@Data
public class Tavolo {
    private int numero;
    private int coperti;
    private double costoCoperto;
    private double costoTotale = costoCoperto*coperti;
    private StatoTavolo stato;

    public Tavolo(int numero, int coperti, double costoCoperto, StatoTavolo stato) {
        this.numero = numero;
        this.coperti = coperti;
        this.costoCoperto = costoCoperto;
        this.stato = stato;
    }
}
