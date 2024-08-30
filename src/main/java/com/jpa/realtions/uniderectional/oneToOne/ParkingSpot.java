package com.jpa.realtions.uniderectional.oneToOne;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "uni_ParkingSpot_oneToOne")
@Table(name = "uni_ParkingSpot_oneToOne")
public class ParkingSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;


}
