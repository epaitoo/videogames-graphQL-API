package com.epaitoo.graphql.videogames.api.repository;

import com.epaitoo.graphql.videogames.api.entity.VideoGame;
import org.springframework.data.repository.CrudRepository;

public interface VideoGameRepository extends CrudRepository<VideoGame, Long> {
}
