﻿# single-tenant

### Run app in Docker container
`docker-compose up --build`

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
