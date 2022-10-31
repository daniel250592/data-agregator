package pl.skoli.dataaggregator.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.skoli.dataaggregator.dto.enums.ContractType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SALARY")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class SalaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salary_generator")
    @SequenceGenerator(name = "salary_generator", sequenceName = "salary_id_seq", allocationSize = 1)
    private Long id;

    private Integer minimum;

    private Integer maximum;

    private String currency;

    @Enumerated(EnumType.STRING)
    @Column(name = "CONTRACT_TYPE")
    private ContractType contractType;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFER_ID", nullable = false)
    private OfferEntity offer;
}
