package pl.skoli.dataaggregator.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.skoli.dataaggregator.entities.OfferEntity;
import pl.skoli.dataaggregator.entities.SalaryEntity;
import pl.skoli.dataaggregator.repositories.OfferRepository;
import pl.skoli.dataaggregator.repositories.SalaryRepository;

@RequiredArgsConstructor
@Service
public class OfferService {

    private final OfferRepository offerRepository;
    private final SalaryRepository salaryRepository;

    public OfferEntity persist(OfferEntity offerEntity){
        OfferEntity save = offerRepository.save(offerEntity);
        for (SalaryEntity salaryEntity : offerEntity.getSalaryList()) {
            salaryEntity.setOffer(save);
            salaryRepository.save(salaryEntity);
        }
        return save;
    }
}
