package pl.skoli.dataaggregator.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.skoli.dataaggregator.dto.Technology;
import pl.skoli.dataaggregator.entities.TechnologyEntity;
import pl.skoli.dataaggregator.mapper.TechnologyMapper;
import pl.skoli.dataaggregator.repositories.TechnologyRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class TechnologyService {

    private final TechnologyRepository technologyRepository;
    private final TechnologyMapper technologyMapper;

    public List<TechnologyEntity> persistTechnologies(final Technology technology) {
        var technologyEntities = technologyMapper.toEntity(technology);

        return technologyEntities.stream()
                .map(this::persistIfNotExist)
                .collect(Collectors.toList());
    }

    private TechnologyEntity persistIfNotExist(final TechnologyEntity technologyEntity) {
        return technologyRepository.findTechnologyEntityByTechnologyName(technologyEntity.getTechnologyName())
                .orElseGet(() -> technologyRepository.save(technologyEntity));
    }
}
