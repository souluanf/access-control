package dev.luanfernandes.access.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Locality {
    @Id
    private  long id;
    @ManyToOne
    private AccessLevel accessLevel;
    private String description;
}
