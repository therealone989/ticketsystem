package com.projektwochejf.ticketsystem.model;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private Long ticketID;
    private String titel;
    private String problem;
    private String status;
    private Time zeit;

    @ManyToOne
    @JoinColumn(name = "id")
    private User LehrerID;

    @ManyToOne
    @JoinColumn(name = "raumId")
    private Raum raumID;

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

    public Time getZeit() {
        return zeit;
    }

    public void setZeit(Time zeit) {
        this.zeit = zeit;
    }

    public User getLehrerID() {
        return LehrerID;
    }

    public void setLehrerID(User lehrerID) {
        LehrerID = lehrerID;
    }

    public Raum getRaumID() {
        return raumID;
    }

    public void setRaumID(Raum raumID) {
        this.raumID = raumID;
    }
}
