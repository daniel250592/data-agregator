package pl.skoli.dataaggregator.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.skoli.dataaggregator.dto.enums.Seniority;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "OFFER")
@Getter
@NoArgsConstructor
@Setter
public class OfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String company;

    private String city;

    @Enumerated(EnumType.STRING)
    private Seniority seniority;

    private LocalDate fetchDate;

    @OneToMany(mappedBy = "offer", targetEntity = SalaryEntity.class, fetch = FetchType.LAZY)
    private List<SalaryEntity> salaryList;
}
