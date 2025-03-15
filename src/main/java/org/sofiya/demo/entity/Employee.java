package org.sofiya.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

/**
 * Сущность Person описывает пользователей системы
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Employee {
    @Id
    private String login;

    private String password;
}
