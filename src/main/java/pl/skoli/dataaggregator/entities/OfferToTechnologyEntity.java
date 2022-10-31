package pl.skoli.dataaggregator.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "OFFER_TO_TECHNOLOGY")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class OfferToTechnologyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "offer_to_technology_generator")
    @SequenceGenerator(name = "offer_to_technology_generator", sequenceName = "offer_to_technology_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "OFFER_ID")
    private Long offerId;

    @Column(name = "TECHNOLOGY_ID")
    private Long technologyId;
}
