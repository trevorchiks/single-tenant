# single-tenant

### Run app in Docker container
`docker-compose up --build`

### Swagger UI
`http://localhost:8080/swagger-ui.html`

### Connect to mysql db 
#### container or installation on same host:
In docker-compose.yml
```
SPRING_DATASOURCE_URL: jdbc:mysql://host.docker.internal:3306/singletenantdb
```

#### Remote server (e.g 192.168.1.1):
In docker-compose.yml
```
SPRING_DATASOURCE_URL: jdbc:mysql://192.168.1.1:3306/singletenantdb
```

Provision Docker container with mysql db
```
docker run --name single-tenant-db -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=singletenantdb -e MYSQL_USER=synchplusclient -e MYSQL_PASSWORD=verysecurepassword -p 3306:3306 -d mysql:8.0
```