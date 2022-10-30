package pl.skoli.dataaggregator.mocks;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.skoli.dataaggregator.dto.Salary;
import pl.skoli.dataaggregator.dto.enums.ContractType;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SalaryMock {
    public static List<Salary> getSalaryListMock() {
        return List.of(new Salary(100,1000,"pln", ContractType.B2B));
    }
}
