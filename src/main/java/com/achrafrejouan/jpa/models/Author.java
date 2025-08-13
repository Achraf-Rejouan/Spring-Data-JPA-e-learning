package com.achrafrejouan.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_seq")
    @SequenceGenerator(name = "author_seq", sequenceName = "author_sequence", allocationSize = 1)
    @Column(name = "author_id")
    private Integer id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private int age;

}
