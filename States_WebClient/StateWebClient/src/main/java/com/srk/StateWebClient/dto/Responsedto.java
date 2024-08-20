package com.srk.StateWebClient.dto;

import com.srk.StateWebClient.model.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Responsedto {

//    public Integer sid;
//    public String sname;
//    public String scode;
    public State state;
    public List<Districtdto> district;


}