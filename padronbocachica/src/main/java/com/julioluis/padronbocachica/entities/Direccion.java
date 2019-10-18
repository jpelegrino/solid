package com.julioluis.padronbocachica.entities;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JoinColumn(name = "provincia_id")
    @ManyToOne
    private Provincia provincia;
    @JoinColumn(name = "municipio_id")
    @ManyToOne
    private Municipio municipio;
    @JoinColumn(name = "sector_id")
    @ManyToOne
    private Sector sector;
    private String calle;
    @Column(name = "apart_num")
    private String apartNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getApartNum() {
        return apartNum;
    }

    public void setApartNum(String apartNum) {
        this.apartNum = apartNum;
    }
}
