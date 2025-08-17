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
public class Lecture extends BaseEntity {
    private String lectureName;
    @ManyToOne
    @JoinColumn(
            name = "section_id"
    )
    private Section section;
    @ManyToOne
    @JoinColumn(
            name = "resource_id"
    )
    private Resources resource;
}
