package pl.skoli.dataaggregator.receiver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import pl.skoli.dataaggregator.dto.Offer;
import pl.skoli.dataaggregator.services.OfferService;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ReceiverMq {

    private final OfferService offerService;

    @RabbitListener(queues = "offers")
    public void get(String offerList) throws JsonProcessingException {

        var objectMapper = new ObjectMapper();

        List<Offer> offers = objectMapper.readValue(offerList, new TypeReference<List<Offer>>() {
        });

        offers.forEach(offerService::persistOffer);
    }
}
