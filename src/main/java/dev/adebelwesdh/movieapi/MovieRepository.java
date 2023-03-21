package dev.adebelwesdh.movieapi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //To target imbd key value in our DB for each document
    Optional<Movie> findMovieByImdbId(String imdbId);
}