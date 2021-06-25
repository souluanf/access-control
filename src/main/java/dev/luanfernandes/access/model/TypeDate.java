package dev.luanfernandes.access.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TypeDate {
    @Id
    private long id;
    private String description;
}
