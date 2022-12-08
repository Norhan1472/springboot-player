
package com.springboot.dao;

import com.springboot.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerDao extends JpaRepository<Player,Long> {

}
