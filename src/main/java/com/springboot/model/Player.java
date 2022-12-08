package com.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "player")
public class Player {
    @Id
    @Column(name="player_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="player_name")
    private String name;

    @Column(name="player_number")
    private int number;

    @Column(name="player_address")
    private String address;

    @Column(name="player_phone")
    private String phone;


}
