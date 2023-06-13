package com.hendisantika.springbootmysqlr2dbc.repository;

import com.hendisantika.springbootmysqlr2dbc.entity.Vehicle;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mysql-r2dbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/14/23
 * Time: 05:42
 * To change this template use File | Settings | File Templates.
 */
public interface VehicleRepository extends ReactiveCrudRepository<Vehicle, Integer> {

    @Query("SELECT * FROM vehicle WHERE make = :make")
    Flux<Vehicle> findByMake(String make);

    @Query("SELECT * FROM vehicle WHERE model = :model")
    Flux<Vehicle> findByModel(String model);
}
