package com.projektwochejf.ticketsystem.model;

import jakarta.persistence.*;

@Entity
public class Raum {

    @Id
    @GeneratedValue
    private Long raumId;
    private String titel;

    @ManyToOne
    @JoinColumn(name = "betreuerId")
    private Lehrer betreuerID;


    public Long getRaumId() {
        return raumId;
    }

    public void setRaumId(Long raumId) {
        this.raumId = raumId;
    }

    public Lehrer getBetreuerId() {
        return betreuerID;
    }

    public void setBetreuerId(Lehrer betreuerId) {
        this.betreuerID = betreuerId;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
