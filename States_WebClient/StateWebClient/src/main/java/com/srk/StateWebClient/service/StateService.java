package com.srk.StateWebClient.service;

import com.srk.StateWebClient.dto.Districtdto;
import com.srk.StateWebClient.dto.Responsedto;
import com.srk.StateWebClient.model.State;
import com.srk.StateWebClient.repository.stateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class StateService {

    @Autowired
    public stateRepo repo;

    public State saveState(State state) {
        return repo.save(state);
    }

    public State getStateById(int id) {
        return repo.findById(id).orElse(null);
    }
    public State getStateByStateCode(String code) {
        return repo.findByScode(code);
    }

    public List<State> getAllStates() {
        return repo.findAll();
    }

    @Autowired
    private WebClient webClient;

    public Responsedto getWithDist(String scode){
        List<Districtdto> districts = webClient.get()
                .uri("http://localhost:8888/district/"+ scode)
                .retrieve()
//                .bodyToFlux(Districtdto.class)
//                .collect(Collectors.toList())
                .bodyToMono(new ParameterizedTypeReference<List<Districtdto>>() {
                })
                .block();
        Responsedto response = new Responsedto();
        State state =  getStateByStateCode(scode);
        response.setState(state);
        response.setDistrict(districts);
        return response;
    }


}