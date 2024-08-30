package com.jpa.realtions.uniderectional.manyToOne;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "uni_School_ManyToOne")
@Table(name = "uni_School_ManyToOne")

public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

}
