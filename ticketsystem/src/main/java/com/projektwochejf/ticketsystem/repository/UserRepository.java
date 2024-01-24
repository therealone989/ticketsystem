package com.projektwochejf.ticketsystem.repository;

import com.projektwochejf.ticketsystem.model.Lehrer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Lehrer, Long> {

}
