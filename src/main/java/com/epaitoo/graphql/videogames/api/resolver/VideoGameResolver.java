package com.epaitoo.graphql.videogames.api.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.epaitoo.graphql.videogames.api.entity.Developer;
import com.epaitoo.graphql.videogames.api.entity.VideoGame;
import com.epaitoo.graphql.videogames.api.repository.DeveloperRespository;

import java.util.Optional;

public class VideoGameResolver implements GraphQLResolver<VideoGame> {
    private DeveloperRespository developerRespository;

    public VideoGameResolver(DeveloperRespository developerRespository) {
        this.developerRespository = developerRespository;
    }

    public Optional<Developer> getDeveloper(VideoGame videoGame) {
        return developerRespository.findById(videoGame.getDeveloper().getId());
    }
}
