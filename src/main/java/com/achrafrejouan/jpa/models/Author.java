package com.achrafrejouan.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 50)
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private int age;
    @Column(
            name = "created_at",
            updatable = false
    )
    private LocalDateTime createdAt;
    @Column(
            name = "updated_at",
            insertable = false
    )
    private LocalDateTime updatedAt;
}
