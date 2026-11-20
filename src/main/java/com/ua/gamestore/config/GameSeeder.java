package com.ua.gamestore.config;

import com.ua.gamestore.domain.Game;
import com.ua.gamestore.repository.GameRepository;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class GameSeeder implements ApplicationRunner {

  private final GameRepository repository;

  @Override
  public void run(ApplicationArguments args) {
    repository.save(
        new Game(
            null,
            "Grand Theft Auto: San Andreas",
            "Rockstar North",
            "PlayStation 2",
            "Action-adventure",
            2004,
            new BigDecimal("399.00"),
            "/images/gta-sa.jpg",
            "Кримінальний екшн про Сі-Джея, який повертається до рідного Лос-Сантоса в штаті"
                + " Сан-Андреас."));

    repository.save(
        new Game(
            null,
            "Minecraft",
            "Mojang",
            "PC",
            "Sandbox",
            2011,
            new BigDecimal("799.00"),
            "/images/minecraft.jpg",
            "Пісочниця з кубічним світом, де можна будувати, видобувати ресурси й виживати."));

    repository.save(
        new Game(
            null,
            "Halo: Combat Evolved",
            "Bungie",
            "Xbox",
            "Shooter",
            2001,
            new BigDecimal("249.00"),
            "/images/halo1.jpg",
            "Шутер про Майстра Чіфа, який бореться з Ковенантом на кільцевому світі Halo."));

    repository.save(
        new Game(
            null,
            "Need for Speed: Underground",
            "EA Black Box",
            "PC",
            "Racing",
            2003,
            new BigDecimal("199.00"),
            "/images/nfsu1.jpg",
            "Нічні вуличні перегони з тюнінгом автомобілів."));

    repository.save(
        new Game(
            null,
            "Need for Speed: Underground 2",
            "EA Black Box",
            "PC",
            "Racing",
            2004,
            new BigDecimal("229.00"),
            "/images/nfsu2.jpg",
            "Вуличні перегони у відкритому місті Бейв'ю з глибоким тюнінгом."));

    repository.save(
        new Game(
            null,
            "Need for Speed: Most Wanted",
            "EA Black Box",
            "PC",
            "Racing",
            2005,
            new BigDecimal("299.00"),
            "/images/nfsmw.jpg",
            "Перегони з поліцейськими погонями та боротьбою за місце в чорному списку."));
  }
}
