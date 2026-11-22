package com.ua.gamestore.service;

import com.ua.gamestore.domain.Game;
import com.ua.gamestore.exception.GameNotFoundException;
import com.ua.gamestore.repository.GameRepository;
import com.ua.gamestore.service.mapper.GameMapper;
import com.ua.gamestore.web.dto.GameCardDto;
import com.ua.gamestore.web.dto.GameDetailDto;
import com.ua.gamestore.web.dto.GameRequest;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GameServiceImpl implements GameService {

  private final GameRepository repository;
  private final GameMapper mapper;

  @Override
  public List<GameCardDto> findAll(String genre) {
    List<Game> games =
        (genre == null || genre.isBlank()) ? repository.findAll() : repository.findByGenre(genre);
    return games.stream().map(mapper::toCard).toList();
  }

  @Override
  public GameDetailDto findById(Long id) {
    Game game = repository.findById(id).orElseThrow(() -> new GameNotFoundException(id));
    return mapper.toDetail(game);
  }

  @Override
  public GameDetailDto create(GameRequest request) {
    Game game = mapper.toDomain(request);
    return mapper.toDetail(repository.save(game));
  }

  @Override
  public GameDetailDto update(Long id, GameRequest request) {
    repository.findById(id).orElseThrow(() -> new GameNotFoundException(id));
    Game game = mapper.toDomain(request);
    game.setId(id);
    return mapper.toDetail(repository.save(game));
  }

  @Override
  public void delete(Long id) {
    if (!repository.deleteById(id)) {
      throw new GameNotFoundException(id);
    }
  }
}
