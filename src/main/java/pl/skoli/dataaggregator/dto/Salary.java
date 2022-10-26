package pl.skoli.dataaggregator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.skoli.dataaggregator.dto.enums.ContractType;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Salary {

    private Integer from;
    private Integer to;
    private String currency;
    private ContractType contractType;
}
