package com.ua.gamestore.web.dto;

import java.math.BigDecimal;

public record GameRequest(
    String title,
    String developer,
    String platform,
    String genre,
    Integer releaseYear,
    BigDecimal price,
    String coverUrl,
    String description) {}
