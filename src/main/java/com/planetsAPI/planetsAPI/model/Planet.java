package com.planetsAPI.planetsAPI.model;


import jakarta.persistence.*;

@Entity
@Table(name ="planets")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int size;
    private String type;

    private Planet(){}

    public Planet(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
