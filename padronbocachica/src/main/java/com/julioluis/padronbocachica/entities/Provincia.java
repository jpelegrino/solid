package com.julioluis.padronbocachica.entities;

import javax.persistence.*;

@Entity
@Table(name = "provincia")
public class Provincia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Provincia(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Provincia() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
