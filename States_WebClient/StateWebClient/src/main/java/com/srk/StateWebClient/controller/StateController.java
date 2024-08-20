package com.srk.StateWebClient.controller;

import com.srk.StateWebClient.dto.Responsedto;
import com.srk.StateWebClient.model.State;
import com.srk.StateWebClient.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    public StateService service;

    @PostMapping("/saveState")
    public State saveState(@RequestBody State state) {
        return service.saveState(state);
    }

    @GetMapping("/getAllStates")
    public List<State> getAllStates() {
        return service.getAllStates();
    }

    @GetMapping("/{scode}")
    public ResponseEntity<Responsedto> getWithDist(@PathVariable("scode") String scode){
        Responsedto responseDto = service.getWithDist(scode);
        return ResponseEntity.ok(responseDto);
    }

}
