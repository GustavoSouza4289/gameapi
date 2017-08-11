package br.com.gustavosouza.gameapi.repository;

import br.com.gustavosouza.gameapi.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {
}
