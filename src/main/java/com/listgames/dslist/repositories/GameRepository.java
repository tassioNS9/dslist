package com.listgames.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listgames.dslist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long> {

}
