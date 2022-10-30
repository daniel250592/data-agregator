package pl.skoli.dataaggregator.mocks;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.skoli.dataaggregator.dto.OfferInfo;
import pl.skoli.dataaggregator.dto.enums.Seniority;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OfferInfoMock {
    public static OfferInfo getOfferInfoMock() {
        return OfferInfo.builder()
                .title("TITLE")
                .company("COMPANY")
                .city("CITY")
                .seniority(Seniority.JUNIOR)
                .build();
    }
}
