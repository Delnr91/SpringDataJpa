package com.jpa.realtions.bidiretional.oneToOne;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bi_Employed_oneToOne")
@Table(name = "bi_Employed_oneToOne")
public class Employed {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @OneToOne
    @JoinColumn(name = "parking_sport_id")
    private ParkingSport parkingSport;

}

