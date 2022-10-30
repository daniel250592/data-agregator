package pl.skoli.dataaggregator.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.skoli.dataaggregator.dto.Offer;
import pl.skoli.dataaggregator.entities.OfferEntity;

@Mapper(componentModel = "spring")
public interface OfferMapper {

    @Mapping(target = "title", source = "offerInfo.title")
    @Mapping(target = "company", source = "offerInfo.company")
    @Mapping(target = "city", source = "offerInfo.city")
    @Mapping(target = "seniority", source = "offerInfo.seniority")
//    @Mapping(target = "fetchDate", source = "offerInfo.fetchDate")
    @Mapping(target = "salaryList", expression = "java(new pl.skoli.dataaggregator.mapper.SalaryMapperImpl().toEntity(offer.getSalaryList()))")
    OfferEntity toEntity(Offer offer);

}
