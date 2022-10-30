package pl.skoli.dataaggregator.mocks;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.skoli.dataaggregator.dto.Technologies;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TechnologiesMock {
    public static Technologies getTechnologiesMock() {
        return new Technologies(List.of("JAVA", "SPRING"));
    }
}
