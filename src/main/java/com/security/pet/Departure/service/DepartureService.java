package com.security.pet.Departure.service;

import com.security.pet.Departure.repository.DepartureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartureService {
    private final DepartureRepository repository;
}
