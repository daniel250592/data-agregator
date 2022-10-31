package pl.skoli.dataaggregator.mocks;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.skoli.dataaggregator.dto.Offer;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OfferMock {

    public static Offer getOfferMock() {
        return Offer.builder()
                .offerInfo(OfferInfoMock.getOfferInfoMock())
                .salaryList(SalaryMock.getSalaryListMock())
                .technology(TechnologiesMock.getTechnologiesMock())
                .build();
    }

}
