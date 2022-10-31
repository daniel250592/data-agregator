package pl.skoli.dataaggregator.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "TECHNOLOGY")
@Getter
@NoArgsConstructor
@Setter
@EqualsAndHashCode
public class TechnologyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "technology_generator")
    @SequenceGenerator(name = "technology_generator", sequenceName = "technology_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "TECHNOLOGY_NAME")
    private String technologyName;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "OFFER_TO_TECHNOLOGY",
            joinColumns = {@JoinColumn(name = "OFFER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "TECHNOLOGY_ID")}
    )
    private Set<OfferEntity> offerEntityList;
}
