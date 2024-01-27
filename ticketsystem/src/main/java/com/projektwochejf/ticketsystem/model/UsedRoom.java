package com.projektwochejf.ticketsystem.model;

import jakarta.persistence.*;

@Entity
public class UsedRoom {

    @Id
    @GeneratedValue
    private Long used_roomid;
    private Long user_in_room;
    private Long room_used;




    public Long getUsed_roomid() {
        return used_roomid;
    }

    public void setUsed_roomid(Long used_roomid) {
        this.used_roomid = used_roomid;
    }

    public Long getUser_in_room() {
        return user_in_room;
    }

    public void setUser_in_room(Long user_in_room) {
        this.user_in_room = user_in_room;
    }

    public Long getRoom_used() {
        return room_used;
    }

    public void setRoom_used(Long room_used) {
        this.room_used = room_used;
    }

}

