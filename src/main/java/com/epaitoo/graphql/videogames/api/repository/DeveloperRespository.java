package com.epaitoo.graphql.videogames.api.repository;

import com.epaitoo.graphql.videogames.api.entity.Developer;
import org.springframework.data.repository.CrudRepository;

public interface DeveloperRespository extends CrudRepository<Developer, Long> {
}
