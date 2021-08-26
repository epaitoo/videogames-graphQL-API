package com.epaitoo.graphql.videogames.api.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.epaitoo.graphql.videogames.api.entity.Developer;
import com.epaitoo.graphql.videogames.api.entity.VideoGame;
import com.epaitoo.graphql.videogames.api.exception.VideoGameNotFoundException;
import com.epaitoo.graphql.videogames.api.repository.DeveloperRespository;
import com.epaitoo.graphql.videogames.api.repository.VideoGameRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {
    private DeveloperRespository developerRespository;
    private VideoGameRepository videoGameRepository;

    public Mutation(DeveloperRespository developerRespository, VideoGameRepository videoGameRepository) {
        this.developerRespository = developerRespository;
        this.videoGameRepository = videoGameRepository;
    }

    public Developer newDeveloper(String name, String country) {
        Developer developer = new Developer(name, country);
        developerRespository.save(developer);
        return developer;
    }

    public VideoGame newVideoGame(String title, String genre, List<String> platform, int releaseYear, Long developerId){
        Developer developer = new Developer(developerId);
        VideoGame videoGame = new VideoGame(title, genre, platform, releaseYear, developer);
        videoGameRepository.save(videoGame);
        return videoGame;
    }

    public VideoGame updateVideoGameTitle(String title, Long id) {
        Optional<VideoGame> optionalVideoGame = videoGameRepository.findById(id);

        if (optionalVideoGame.isPresent()) {
            VideoGame videoGame = optionalVideoGame.get();
            videoGame.setTitle(title);
            videoGameRepository.save(videoGame);
            return videoGame;
        } else {
            throw new VideoGameNotFoundException("VideoGame Not Found", id);
        }

    }

    public boolean deleteVideoGame(Long id){
        videoGameRepository.deleteById(id);
        return true;
    }


}
