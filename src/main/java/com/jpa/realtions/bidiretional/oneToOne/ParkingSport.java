package com.jpa.realtions.bidiretional.oneToOne;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bi_ParkingSport_oneToOne")
@Table(name = "bi_ParkingSport_oneToOne")
public class ParkingSport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @OneToOne(mappedBy = "parkingSport")
    private Employed employed;

}
