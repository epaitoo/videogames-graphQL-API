# VideoGames GraphQL API
A Simple GraphQL API Implementation With Spring Boot. An api with CRUD features for Videogames and its developers.


## Features
- Add Developers and their respective videogames
- Update and Delete a Videogame.


## Getting Started
These instructions will get you a copy of the project up and running on your local machine.

- Download and unzip the repository or clone it
- Open the project in IntelliJ or your favourite IDE
- To run the app with H2 In-memory Database, uncomment the H2 Dependancy in the pom.xml
- Uncomment the H2 Database properties in the src/main/resources/application.properties
- Run the main application class 

## Testing with [GraphiQL](https://github.com/skevy/graphiql-app)
- Go to http://localhost:8080/graphiql
- For instance you can test `newDeveloper` mutation by
    `mutation{
      newDeveloper(
        name: "EA DICE"
        country: "Sweden"
      ){
        name
      }
    }
    `
