package com.ua.gamestore.domain;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Game {
  private Long id;
  private String title;
  private String developer;
  private String platform;
  private String genre;
  private Integer releaseYear;
  private BigDecimal price;
  private String coverUrl;
  private String description;
}
