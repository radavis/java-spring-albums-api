# albums app

CRUD Albums with Spring Boot and MySQL.

Inspired by the [Spring MySQL getting started guide](https://spring.io/guides/gs/accessing-data-mysql/).


## Add an Album

```bash
curl localhost:8080/albums \
  -d artist="Nirvana" \
  -d title="Nevermind" \
  -d year=1991
```

## View Albums

Visit <http://localhost:8080/albums>.
