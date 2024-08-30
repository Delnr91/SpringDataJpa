package com.jpa.realtions.bidiretional.manyToOne;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bi_School_ManyToOne")
@Table(name = "bi_School_ManyToOne")

public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;


    @OneToMany(mappedBy = "school" )
    private List<Student> studentList;

}
