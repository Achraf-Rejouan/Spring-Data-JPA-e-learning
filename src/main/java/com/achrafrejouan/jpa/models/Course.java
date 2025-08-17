package com.achrafrejouan.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
public class Course extends BaseEntity{
    private String title;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "course_authors",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Author> authors;

    @OneToMany(
            mappedBy = "course"
    )
    private List<Section> sections;

}
