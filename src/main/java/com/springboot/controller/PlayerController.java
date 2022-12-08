package com.springboot.controller;

import com.springboot.model.Player;
import com.springboot.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    @GetMapping("/players")
    public List<Player> getPlayers(){
        return playerService.getData();
    }

    @GetMapping("/players/{id}")
    public Player getPlayerById(@PathVariable("id") long id){
        Player player=playerService.getDataById(id);
        if(player ==null){
             throw new RuntimeException("player isn't exist");
        }
        return player;
    }

    @PostMapping("/players")
    public void addPlayer(@RequestBody Player player){
         playerService.addData(player);
    }

    @PutMapping("/players")
    public void editPlayer(@RequestBody Player player){
        playerService.addData(player);
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayer(@PathVariable("id") long id){
        Player player=playerService.getDataById(id);
        if(player ==null){
            throw new RuntimeException("player isn't exist");
        }
        playerService.deleteData(id);
    }
}
