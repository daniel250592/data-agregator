package pl.skoli.dataaggregator.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import pl.skoli.dataaggregator.entities.OfferEntity;
import pl.skoli.dataaggregator.mocks.OfferMock;

@SpringBootTest
@SpringJUnitConfig
class OfferServiceTest {

    @Autowired
    private OfferService offerService;
    @Autowired
    private ExtendedOfferMapper extendedOfferMapper;

    @Test
    void persist() {

        OfferEntity offerEntity = extendedOfferMapper.mapToEntity(OfferMock.getOfferMock());

        offerService.persistOffers(offerEntity);
    }
}