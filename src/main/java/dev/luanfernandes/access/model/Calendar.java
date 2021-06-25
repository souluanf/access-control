package dev.luanfernandes.access.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Calendar {
    @Id
    private Long id;
    @ManyToOne
    private TypeDate dateType;
    private String description;
    private LocalDateTime specialDate;
}
