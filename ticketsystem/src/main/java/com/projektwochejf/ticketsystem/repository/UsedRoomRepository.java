package com.projektwochejf.ticketsystem.repository;

import com.projektwochejf.ticketsystem.model.UsedRoom;
import com.projektwochejf.ticketsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsedRoomRepository extends JpaRepository<UsedRoom, Long> {
}
