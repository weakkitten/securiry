package com.security.pet.Departure.repository;

import com.security.pet.Departure.model.Departure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartureRepository extends JpaRepository<Departure, Long> {
}
