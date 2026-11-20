package com.ua.gamestore.repository;

import com.ua.gamestore.domain.Game;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryGameRepository implements GameRepository {

  private final Map<Long, Game> storage = new ConcurrentHashMap<>();
  private final AtomicLong sequence = new AtomicLong(0);

  @Override
  public List<Game> findAll() {
    return new ArrayList<>(storage.values());
  }

  @Override
  public Optional<Game> findById(Long id) {
    return Optional.ofNullable(storage.get(id));
  }

  @Override
  public Game save(Game game) {
    if (game.getId() == null) {
      game.setId(sequence.incrementAndGet());
    }
    storage.put(game.getId(), game);
    return game;
  }
}
