
package com.springboot.dao;

import com.springboot.model.Player;

import java.util.List;

public interface PlayerDao {
    public List<Player> getPlayers();

    public Player showPlayer(long id);

    public void addPlayer(Player player);

    public void deletePlayer(long id);
}
