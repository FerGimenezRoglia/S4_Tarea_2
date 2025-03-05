package cat.itacademy.s04.t02.n02.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fruit")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(name = "quantity_kilos", nullable = false)
    private int quantityKilos;

    public Fruit() {
    }

    public Fruit(String name, int quantityKilos) {
        this.name = name;
        this.quantityKilos = quantityKilos;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantityKilos() {
        return quantityKilos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantityKilos(int quantityKilos) {
        this.quantityKilos = quantityKilos;
    }
}