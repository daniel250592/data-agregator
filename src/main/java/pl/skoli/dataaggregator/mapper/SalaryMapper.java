package pl.skoli.dataaggregator.mapper;

import org.mapstruct.Mapper;
import pl.skoli.dataaggregator.dto.Salary;
import pl.skoli.dataaggregator.entities.SalaryEntity;

import java.util.List;

@Mapper
interface SalaryMapper {

    List<SalaryEntity> toEntity(List<Salary> salary);
}
