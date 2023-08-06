package lila.com.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepositroy extends MongoRepository<Review, ObjectId> {
}
