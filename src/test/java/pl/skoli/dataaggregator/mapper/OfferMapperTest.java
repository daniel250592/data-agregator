package pl.skoli.dataaggregator.mapper;

import org.junit.jupiter.api.Test;
import pl.skoli.dataaggregator.dto.Offer;
import pl.skoli.dataaggregator.entities.OfferEntity;
import pl.skoli.dataaggregator.mocks.OfferMock;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class OfferMapperTest {

    @Test
    void shouldProperlyMapObject() {

        Offer offerMock = OfferMock.getOfferMock();
        OfferMapper offerMapper = new OfferMapperImpl();

        OfferEntity offerEntity = offerMapper.toEntity(offerMock);

        assertNotNull(offerEntity);
    }
}