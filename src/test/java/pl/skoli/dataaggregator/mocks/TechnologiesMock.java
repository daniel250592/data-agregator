package pl.skoli.dataaggregator.mocks;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.skoli.dataaggregator.dto.Technology;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TechnologiesMock {
    public static Technology getTechnologiesMock() {
        return new Technology(List.of("JAVA", "SPRING"));
    }
}
