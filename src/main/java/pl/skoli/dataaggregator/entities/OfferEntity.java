package pl.skoli.dataaggregator.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.skoli.dataaggregator.dto.enums.Seniority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "OFFER")
@Getter
@NoArgsConstructor
@Setter
public class OfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "offer_generator")
    @SequenceGenerator(name = "offer_generator", sequenceName = "offer_id_seq", allocationSize = 1)
    private Long id;

    private String title;

    private String company;

    private String city;

    @Enumerated(EnumType.STRING)
    private Seniority seniority;

    @Column(name = "FETCH_DATE")
    private String fetchDate;
}
