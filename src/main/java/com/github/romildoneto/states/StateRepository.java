package com.github.romildoneto.states;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<State, Long> {
}