package pl.skoli.dataaggregator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.skoli.dataaggregator.entities.SalaryEntity;

@Repository
public interface SalaryRepository extends JpaRepository<SalaryEntity, Long> {
}
