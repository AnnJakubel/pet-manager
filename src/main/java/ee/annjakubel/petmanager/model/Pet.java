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

    @NotNull
    private String name;

    @Id
    private Long code;

    @NotNull(message = "field must not be null")
    private String type;

    @NotNull(message = "field must not be null")
    private String color;

    @NotNull(message = "field must not be null")
    private String country;
}
