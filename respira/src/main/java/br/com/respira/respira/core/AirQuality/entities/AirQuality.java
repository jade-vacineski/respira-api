package br.com.respira.respira.core.AirQuality.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AirQuality {

    private String location;
    private double pm25;
    private double pm10;
    private double co2;
}
