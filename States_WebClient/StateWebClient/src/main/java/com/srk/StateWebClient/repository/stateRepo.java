package com.srk.StateWebClient.repository;

import com.srk.StateWebClient.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface stateRepo extends JpaRepository<State, Integer> {

    State findByScode(String scode);
}
