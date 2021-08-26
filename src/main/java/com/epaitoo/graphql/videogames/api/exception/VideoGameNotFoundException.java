package com.epaitoo.graphql.videogames.api.exception;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoGameNotFoundException extends RuntimeException implements GraphQLError {
    private Map<String, Object> extensions = new HashMap<>();

    public VideoGameNotFoundException(String message, Long invalidVideoGameId) {
        super(message);
        extensions.put("InvalidVideoGameId", invalidVideoGameId);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }

}
