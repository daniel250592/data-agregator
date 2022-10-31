package pl.skoli.dataaggregator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.skoli.dataaggregator.dto.enums.Seniority;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfferInfo {

    private String title;
    private String company;
    private String city;
    private Seniority seniority;
    private final String fetchDate = LocalDateTime.now().toString();

}
