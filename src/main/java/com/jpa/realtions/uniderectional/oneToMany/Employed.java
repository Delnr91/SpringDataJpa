package com.jpa.realtions.uniderectional.oneToMany;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "uni_Employed_oneToMany")
@Table(name = "uni_Employed_oneToMany")

public class Employed {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

}
