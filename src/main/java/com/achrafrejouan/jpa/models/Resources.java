package com.achrafrejouan.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
public class Resources extends BaseEntity {
    private String name;
    private int size;
    private String url;

    @OneToOne
    @JoinColumn(
            name = "lecture_id"
    )
    private Lecture lecture;
}
