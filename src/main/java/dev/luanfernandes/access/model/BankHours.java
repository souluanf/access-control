package dev.luanfernandes.access.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BankHours {


    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public static class BankHoursId implements Serializable{
        private long idBankHours;
        private long idMovement;
        private long idUser;


    }
    @EmbeddedId
    private BankHoursId bankHoursId;
    private LocalDateTime dateWorked;
    private BigDecimal quantityHours;
    private BigDecimal hoursBalance;

}
