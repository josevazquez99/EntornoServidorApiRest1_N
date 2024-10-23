package com.vedruna.apiRest1_N.dto;

import com.vedruna.apiRest1_N.persistance.models.Player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {

    private Integer playerId;
    private String name;
    private Integer age;
    private Integer teamId; 

    public PlayerDTO(Player p) {
        this.playerId = p.getPlayerId();
        this.name = p.getName();
        this.age = p.getAge();
        this.teamId = p.getPlayerTeam() != null ? p.getPlayerTeam().getTeamId() : null; 
    }
}
