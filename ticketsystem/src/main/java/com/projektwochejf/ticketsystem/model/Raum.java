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
    private User betreuerId;



    public Long getRaumId() {
        return raumId;
    }

    public void setRaumId(Long raumId) {
        this.raumId = raumId;
    }

    public User getBetreuerId() {
        return betreuerId;
    }

    public void setBetreuerId(User betreuerId) {
        this.betreuerId = betreuerId;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
