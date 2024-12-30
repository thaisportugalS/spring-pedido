package com.pedidos.adapter.out;

import com.pedidos.domain.Pedido;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.stereotype.Component;

@Component
@EnableKafka

public class PedidoProducerKafka {
    private final KafkaTemplate<String, Pedido> kafkaTemplate;

    public PedidoProducerKafka(KafkaTemplate<String, Pedido> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarPedido(Pedido pedido) {
        kafkaTemplate.send("pedido-topic", pedido);
    }
}

