# spring-boot-mysql-r2dbc

## Introduction

Reactive design patterns have rapidly increased in popularity due to the increased scalability, elasticity, and
responsiveness they provide. Until recently, relational database interaction has largely remained unchanged and reliant
on synchronous queries. With the establishment of the R2DBC specification, database drivers can be developed in a
unified standard (as seen with JDBC) and built on a non-blocking network layer, providing all of the expected benefits
of a reactive data source.

With the release of Spring Framework 5.3, R2DBC core has been migrated out of the Spring Data package and up a level
into the r2dbc sub-package. If you try to use any components in the *org.springframework.data.r2dbc.**, you will notice
the deprecations.

With this 5.3 milestone comes a large number of features and improved integration with other parts of the Spring
ecosystem. Most notably, Introduction
Reactive design patterns have rapidly increased in popularity due to the increased scalability, elasticity, and
responsiveness they provide. Until recently, relational database interaction has largely remained unchanged and reliant
on synchronous queries. With the establishment of the R2DBC specification, database drivers can be developed in a
unified standard (as seen with JDBC) and built on a non-blocking network layer, providing all of the expected benefits
of a reactive data source.

With the release of Spring Framework 5.3, R2DBC core has been migrated out of the Spring Data package and up a level
into the r2dbc sub-package. If you try to use any components in the *org.springframework.data.r2dbc.**, you will notice
the deprecations.

With this 5.3 milestone comes a large number of features and improved integration with other parts of the Spring
ecosystem. Most notably, **ConnectionFactory** implementations, schema initializations, and integration with transaction
management constructs such as the **@Transactional** annotation. implementations, schema initializations, and
integration with transaction management constructs such as the @Transactional annotation.

DB Support:

* H2 (io.r2dbc:r2dbc-h2)
* MariaDB (org.mariadb:r2dbc-mariadb)
* Microsoft SQL Server (io.r2dbc:r2dbc-mssql)
* MySQL (io.asyncer:r2dbc-mysql)
* jasync-sql MySQL (com.github.jasync-sql:jasync-r2dbc-mysql)
* Postgres (io.r2dbc:r2dbc-postgresql)
* Oracle (com.oracle.database.r2dbc:oracle-r2dbc)

H2 Driver

```shell
<dependency>
    <groupId>io.r2dbc</groupId>
    <artifactId>r2dbc-h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

MySQL R2DBC Maven dependencies

```shell
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
</dependency>
<dependency>
    <groupId>dev.miku</groupId>
    <artifactId>r2dbc-mysql</artifactId>
    <version>0.8.2.RELEASE</version>
</dependency>
```

PostgreSQL R2DBC

```shell
<dependency>
    <groupId>io.r2dbc</groupId>
    <artifactId>r2dbc-postgresql</artifactId>
    <version>0.8.6.RELEASE</version>
</dependency>
```
