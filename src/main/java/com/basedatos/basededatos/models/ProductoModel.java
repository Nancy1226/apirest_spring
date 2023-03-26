package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "Producto")
public class ProductoModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private int price;

    @ManyToOne
    private FabricanteModel fabricanteModel;

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
    public FabricanteModel getFabricanteModel() {
        return fabricanteModel;
    }

    public void setFabricanteModel(FabricanteModel fabricanteModel) {
        this.fabricanteModel = fabricanteModel;
    }
}
