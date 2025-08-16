package com.achrafrejouan.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Lecture {
    @Id
    @GeneratedValue
    private Integer id;
    private String lectureName;
    @ManyToOne
    @JoinColumn(
            name = "section_id"
    )
    private Section section;
    private Resources resource;
}
