package pl.skoli.dataaggregator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.skoli.dataaggregator.entities.TechnologyEntity;

import java.util.Optional;

@Repository
public interface TechnologyRepository extends JpaRepository<TechnologyEntity, Long> {

    Optional<TechnologyEntity> findTechnologyEntityByTechnologyName(String technologyName);
}
