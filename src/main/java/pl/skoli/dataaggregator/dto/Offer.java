package pl.skoli.dataaggregator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Offer {

    private OfferInfo offerInfo;
    private List<Salary> salaryList;
    private Technologies technologies;
}
