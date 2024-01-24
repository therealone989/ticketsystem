package com.projektwochejf.ticketsystem.repository;

import com.projektwochejf.ticketsystem.model.UsedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsedRoomRepository extends JpaRepository<UsedRoom, Long> {
}
