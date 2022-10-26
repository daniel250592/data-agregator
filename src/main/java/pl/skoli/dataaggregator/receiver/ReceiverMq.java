package pl.skoli.dataaggregator.receiver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.RestController;
import pl.skoli.dataaggregator.dto.Offer;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReceiverMq {

    private final RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "offers")
    public void get(String offerList) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        List<Offer> offers = objectMapper.readValue(offerList, new TypeReference<List<Offer>>() {
        });

        System.out.println(offers);
    }
}
