package com.springboot.dao;

import com.springboot.model.Player;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class PlayerDaoImpl implements PlayerDao {
    @Autowired
    EntityManager entityManager ;

    public PlayerDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Player> getPlayers() {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createQuery("from Player",Player.class);

        return q.getResultList();
    }

    @Override
    public Player showPlayer(long id) {
        Session session = entityManager.unwrap(Session.class);
        Player player =session.get(Player.class,id);
        return player;
    }

    @Override
    public void addPlayer(Player player) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(player);
    }

    @Override
    public void deletePlayer(long id) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createQuery("delete from Player where id = ?1");
        q.setLong(1,id);
         q.executeUpdate();
    }
}
