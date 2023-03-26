package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "MecaSoft")
public class MecaSoft {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name_gass", nullable = false)
    private String name;

    @Column(name = "name_users", nullable = false)
    private String name_users;

    @Column(name = "email", nullable = false)
    private boolean email;

    @Column(name = "matricula", nullable = false)
    private int matricula;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "confirmpassword", nullable = false)
    private String confirmpassword;

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

    public String getName_users() {
        return name_users;
    }

    public void setName_users(String name_users) {
        this.name_users = name_users;
    }

    public boolean isEmail() {
        return email;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
}

