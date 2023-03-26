package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "Producto")
public class Producto {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private int price;
    @Column(name = "id_fabricante", nullable = false)
    private String id_fabricante;

    @ManyToOne
    private Fabricante fabricante;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(String id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
