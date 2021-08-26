package com.epaitoo.graphql.videogames.api.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.epaitoo.graphql.videogames.api.entity.Developer;
import com.epaitoo.graphql.videogames.api.entity.VideoGame;
import com.epaitoo.graphql.videogames.api.repository.DeveloperRespository;
import com.epaitoo.graphql.videogames.api.repository.VideoGameRepository;

public class Query implements GraphQLQueryResolver {
    private VideoGameRepository videoGameRepository;
    private DeveloperRespository developerRespository;

    public Query(VideoGameRepository videoGameRepository, DeveloperRespository developerRespository) {
        this.videoGameRepository = videoGameRepository;
        this.developerRespository = developerRespository;
    }

    public Iterable<VideoGame> findAllVideoGames() {
        return videoGameRepository.findAll();
    }

    public Iterable<Developer> findAllDevelopers() {
        return developerRespository.findAll();
    }

}
