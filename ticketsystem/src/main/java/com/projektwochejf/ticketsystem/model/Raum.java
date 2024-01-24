package com.projektwochejf.ticketsystem.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Raum {


    @Id
    @GeneratedValue
    private Long raumId;
    private String titel;


    public Long getRaumId() {
        return raumId;
    }

    public void setRaumId(Long raumId) {
        this.raumId = raumId;
    }


    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
