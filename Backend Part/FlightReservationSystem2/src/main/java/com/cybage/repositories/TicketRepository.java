package com.cybage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cybage.model.Ticket;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
