package com.projektwochejf.ticketsystem.model;

import jakarta.persistence.*;

@Entity
public class UsedRoom {

    @Id
    @GeneratedValue
    private Long usedRoomID;

    @ManyToOne
    @JoinColumn(name = "id")
    private User userInRoom;

    @ManyToOne
    @JoinColumn(name = "raumId")
    private Raum roomUsed;

    public Long getUsedRoomID() {
        return usedRoomID;
    }

    public void setUsedRoomID(Long usedRoomID) {
        this.usedRoomID = usedRoomID;
    }

    public User getUserInRoom() {
        return userInRoom;
    }

    public void setUserInRoom(User userInRoom) {
        this.userInRoom = userInRoom;
    }

    public Raum getRoomUsed() {
        return roomUsed;
    }

    public void setRoomUsed(Raum roomUsed) {
        this.roomUsed = roomUsed;
    }
}
