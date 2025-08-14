package com.achrafrejouan.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "course_authors",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Author> authors;

}
