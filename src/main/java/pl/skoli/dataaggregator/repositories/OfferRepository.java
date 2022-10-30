package pl.skoli.dataaggregator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.skoli.dataaggregator.entities.OfferEntity;

@Repository
public interface OfferRepository extends JpaRepository<OfferEntity,Long> {
}
