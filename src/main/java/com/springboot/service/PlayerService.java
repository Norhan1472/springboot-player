package com.springboot.service;

import com.springboot.model.Player;

import java.util.List;

public interface PlayerService {

    public List<Player> getData();

    public Player getDataById(long id);

    public void addData(Player player);

    public void deleteData(long id);
}
