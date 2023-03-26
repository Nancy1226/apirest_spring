package com.basedatos.basededatos.models;

import jakarta.persistence.*;
@Entity
@Table(schema = "Fabricante")
public class Fabricante {
        @Id
        @Column(name = "id",updatable = false, nullable = false,  unique = true)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name = "name", nullable = false)
        private String name;

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
}

