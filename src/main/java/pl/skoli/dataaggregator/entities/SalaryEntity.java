package pl.skoli.dataaggregator.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.skoli.dataaggregator.dto.enums.ContractType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SALARY")
@Getter
@Setter
@NoArgsConstructor
public class SalaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer minimum;

    private Integer maximum;

    private String currency;

    @Enumerated(EnumType.STRING)
    @Column(name = "CONTRACT_TYPE")
    private ContractType contractType;

    @ManyToOne(optional = false)
    @JoinColumn(name = "OFFER_ID", nullable = false)
    private OfferEntity offer;

    public void assignOffer(final OfferEntity offerEntity) {
        this.setOffer(offerEntity);
    }
}
