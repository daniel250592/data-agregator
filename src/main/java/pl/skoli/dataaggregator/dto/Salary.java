package pl.skoli.dataaggregator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.skoli.dataaggregator.dto.enums.ContractType;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Salary {

    private Integer minimum;
    private Integer maximum;
    private String currency;
    private ContractType contractType;
}
