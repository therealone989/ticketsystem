package com.projektwochejf.ticketsystem.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private Long ticketID;
    private String titel;
    private String problem;
    private String status;
    private Timestamp zeit;
    private Long lehrerID;
    private Long raumID;

    public Timestamp getZeit() {
        return zeit;
    }

    public void setZeit(Timestamp zeit) {
        this.zeit = zeit;
    }

    public Long getTicketID() {
        return ticketID;
    }

    public void setTicketID(Long ticketID) {
        this.ticketID = ticketID;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getLehrerID() {
        return lehrerID;
    }

    public void setLehrerID(Long lehrerID) {
        this.lehrerID = lehrerID;
    }

    public Long getRaumID() {
        return raumID;
    }

    public void setRaumID(Long raumID) {
        this.raumID = raumID;
    }
}
