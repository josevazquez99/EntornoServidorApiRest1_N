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
    private TeamDTO teamdto;

    public PlayerDTO(Player p) {
        this.playerId = p.getPlayerId();
        this.name = p.getName();
        this.age = p.getAge();
        this.teamdto = new TeamDTO(p.getPlayerTeam());
    }
    
}
