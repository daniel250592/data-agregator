package pl.skoli.dataaggregator.mapper;

import org.springframework.stereotype.Component;
import pl.skoli.dataaggregator.dto.Technology;
import pl.skoli.dataaggregator.entities.TechnologyEntity;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TechnologyMapper {

    public List<TechnologyEntity> toEntity(final Technology technology) {

        return technology.getTechnologyList().stream()
                .map(technologyName -> {
                    var technologyEntity = new TechnologyEntity();
                    technologyEntity.setTechnologyName(technologyName);
                    return technologyEntity;
                })
                .collect(Collectors.toList());

    }
}
