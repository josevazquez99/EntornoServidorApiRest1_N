package com.vedruna.apiRest1_N.dto;


import com.vedruna.apiRest1_N.persistance.models.Team;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamDTO {
    private Integer teamId;
    private String name;

    public TeamDTO(Team t) {
        this.teamId = t.getTeamId();
        this.name = t.getName() ;

    }


}
