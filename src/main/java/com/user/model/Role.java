package com.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SequenceGenerator(name = "custom_id",sequenceName = "custom_id",initialValue = 101)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "custom_id")
    private int roleId;
    private String name;
}
