package com.dream.team.usercrud.domian;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@Entity(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @NotBlank(message = "Name is mandatory")
    String name;

    @NotBlank(message = "Name is mandatory")
    String email;

}
