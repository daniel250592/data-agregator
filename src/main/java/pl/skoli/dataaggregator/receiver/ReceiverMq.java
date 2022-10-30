package pl.skoli.dataaggregator.receiver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import pl.skoli.dataaggregator.dto.Offer;
import pl.skoli.dataaggregator.entities.OfferEntity;
import pl.skoli.dataaggregator.mapper.OfferMapper;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ReceiverMq {

    private final OfferMapper offerMapper;

    @RabbitListener(queues = "offers")
    public void get(String offerList) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        List<Offer> offers = objectMapper.readValue(offerList, new TypeReference<List<Offer>>() {
        });

        List<OfferEntity> collect = offers.stream()
                .map(offerMapper::toEntity)
                .collect(Collectors.toList());


        System.out.println(collect);
    }
}
