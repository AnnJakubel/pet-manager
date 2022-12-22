package ee.annjakubel.petmanager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "field must not be null")
    private String animalType;

    @NotNull(message = "field must not be null")
    private String furColor;

    @NotNull(message = "field must not be null")
    private String cOfOrigin;
}
