package pl.skoli.dataaggregator.receiver;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReceiverMq {

    private final RabbitTemplate rabbitTemplate;

//    @RabbitListener(queues = "offers")
//    public void get(String offer) {
//
//        System.out.println(offer);
//    }
}
