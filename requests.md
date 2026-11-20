# Запити

Запуск: `./mvnw spring-boot:run`.

## Перелік ігор

```bash
curl http://localhost:8080/api/games
```

Повертає масив карток: `id`, `title`, `platform`, `price`, `coverUrl`.

## Інфа про конкретну гру

```bash
curl http://localhost:8080/api/games/1
```

Повертає всі поля: `id`, `title`, `developer`, `platform`, `genre`, `releaseYear`, `price`,
`coverUrl`, `description`.

## Неіснуюча гра -> 404

```bash
curl -i http://localhost:8080/api/games/999
```

Очікуєм: `HTTP/1.1 404`.
