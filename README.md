# Spring Boot | Api Rest - <img src="https://www.alura.com.br/assets/api/cursos/spring-boot-3-desenvolva-api-rest-java.svg" width="40">
O objetivo neste projeto é usar o Spring Boot para desenvolve uma API Rest, com algumas funcionalidades, desenvolver um CRUD, 
sendo as quatro operações fundamentais das aplicações: cadastro, listagem, atualização e exclusão de informações.
Isto é, praticar e desenvolver um CRUD de uma API Rest usando o Spring Boot.

<hr>
Technologies used:<br>
<p>Mysql Connect j <img src="https://www.mysql.com/common/logos/powered-by-mysql-167x86.png" width="50"></p>
<p>Flyway <img src="https://flywaydb.org/wp-content/uploads/2020/12/cropped-favicon-32x32.png" width="40"></p>
<p>Bean Validation <img src="https://beanvalidation.org/logo/logo.svg" width="40"></p>
<p>Spring Data <img src="https://www.alura.com.br/assets/api/cursos/persistencia-jpa-introducao-hibernate.svg" width="40"></p>
<p>Spring Dev Tools <img src="https://devkico.itexto.com.br/wp-content/uploads/2014/08/spring-boot-project-logo-300x270.png" width="40"></p>
<p>Lombok <img src="https://www.opencodez.com/wp-content/uploads/2018/08/lombok.png" width="40"></p>
<hr>

## Class Record
<p>Record class, created from java 16, has the purpose of creating basic attributes of a class, in this project, I use it as responsible for my DTO entities, and it works perfectly, under the covers, java manipulates the record class to to behave as such.</p>

## Database versioning with flyway migrations
* V1__create-table-medico.sql
* V2__alter-table-medico-add-tel.sql
* V3__alter-table-medico-add-ativo.sql
<hr>

<p>In this project, the current annotations for the spring boot 3 version, database versioning, the importance of using Record Classes to behave like DTO's, I emphasize the importance of using DTO's to move objects , see why to use it, it's worth a lot if you want your application to also be protected against attacks, this study will continue in the api-rest-v4 study project</p>
