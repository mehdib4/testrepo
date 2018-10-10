/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aisyhire.server;


import lombok.*;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

/**
 *
 * @author Mehdi Benkirane
 */
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Car {
    @Id @GeneratedValue
    private Long id;
    private @NonNull String name;
}