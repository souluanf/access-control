package dev.luanfernandes.access.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Movement {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public static class  MovementId implements Serializable{
            private long idMovement;
            private long idUser;
        }
        @Id
        @EmbeddedId
        private MovementId movementId;
        private LocalDateTime dateEntry;
        private LocalDateTime departureDate;
        private BigDecimal period;
        @ManyToOne
        private Occurrence occurrence;
        @ManyToOne
        private Calendar calendar;
}
