package fr.fms.api_trainings.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Training implements Serializable {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String description;
    private double price;
    private int quantity;
}
