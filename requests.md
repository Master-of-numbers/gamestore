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

## Фільтрування за жанром

```bash
curl "http://localhost:8080/api/games?genre=Racing"
```

Отримаєм ігри жангу гонок (case insensetive).

## Створити гру -> 201

```bash
curl -i -X POST http://localhost:8080/api/games \
  -H "Content-Type: application/json" \
  -d '{"title":"Portal 2","developer":"Valve","platform":"PC","genre":"Puzzle","releaseYear":2011,"price":149.00,"coverUrl":"/images/portal2.jpg","description":"Головоломка."}'
```

## Оновити гру -> 200 / 404

```bash
curl -i -X PUT http://localhost:8080/api/games/1 \
  -H "Content-Type: application/json" \
  -d '{"title":"GTA: San Andreas (Definitive)","developer":"Rockstar North","platform":"PC","genre":"Action-adventure","releaseYear":2004,"price":499.00,"coverUrl":"/images/gta-sa.jpg","description":"Оновлений опис."}'
```

## Видалити гру -> 204 / 404

```bash
curl -i -X DELETE http://localhost:8080/api/games/2
```
