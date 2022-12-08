package com.springboot.service;

import com.springboot.dao.PlayerDao;
import com.springboot.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    PlayerDao playerDao;

    public PlayerServiceImpl(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    @Override
    public List<Player> getData() {
        return playerDao.getPlayers();
    }

    @Override
    public Player getDataById(long id) {
        return playerDao.showPlayer(id);
    }

    @Override
    public void addData(Player player) {
         playerDao.addPlayer(player);
    }

    @Override
    public void deleteData(long id) {
        playerDao.deletePlayer(id);
    }


}
