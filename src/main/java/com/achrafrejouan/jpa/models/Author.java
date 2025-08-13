package com.achrafrejouan.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "author_table")
@Entity
@Data
@NoArgsConstructor
public class Author {
    @Id
    @Column(name = "author_id")
    @GeneratedValue
    /*(
            strategy = GenerationType.TABLE,
            generator = "author_tab"
    )
    @TableGenerator(
            name = "author_tab",
            table = "id_generator",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            allocationSize = 1
    )
    @SequenceGenerator(
    name = "author_seq",
     sequenceName = "author_sequence",
      allocationSize = 1
      )*/
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
