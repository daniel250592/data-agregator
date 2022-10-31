package pl.skoli.dataaggregator.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.skoli.dataaggregator.dto.Offer;
import pl.skoli.dataaggregator.entities.OfferEntity;
import pl.skoli.dataaggregator.entities.SalaryEntity;
import pl.skoli.dataaggregator.mapper.OfferMapper;
import pl.skoli.dataaggregator.mapper.SalaryMapper;
import pl.skoli.dataaggregator.repositories.OfferRepository;
import pl.skoli.dataaggregator.repositories.SalaryRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OfferService {

    private final OfferRepository offerRepository;
    private final SalaryRepository salaryRepository;
    private final OfferMapper offerMapper;
    private final SalaryMapper salaryMapper;
    private final TechnologyService technologyService;


    public void persistOffer(final Offer offer) {

        var offerEntity = this.persistOffers(offerMapper.toEntity(offer));

        var salaryEntities = salaryMapper.toEntity(offer.getSalaryList());

        salaryEntities.forEach(s -> s.setOffer(offerEntity));

        technologyService.persistTechnologies(offer.getTechnology());

        this.persistSalary(salaryEntities);
    }

    private OfferEntity persistOffers(final OfferEntity offerEntity) {
        return offerRepository.save(offerEntity);

    }

    private List<SalaryEntity> persistSalary(final List<SalaryEntity> salaryEntityList) {
        return salaryRepository.saveAll(salaryEntityList);
    }
}
