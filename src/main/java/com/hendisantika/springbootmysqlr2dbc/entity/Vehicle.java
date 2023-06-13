package com.hendisantika.springbootmysqlr2dbc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mysql-r2dbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/14/23
 * Time: 05:41
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
@NoArgsConstructor
public class Vehicle {
    @Id
    private Integer id;
    private String make;
    private String model;
    private String color;

    public Vehicle(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }
}
