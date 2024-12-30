package com.pedidos.adapter.out;

import com.pedidos.domain.Pedido;
import com.pedidos.port.PedidoRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoConsumerKafka {

    private final PedidoRepository pedidoRepository;

    public PedidoConsumerKafka(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @KafkaListener(topics = "pedido-topic", groupId = "pedido-group")
    public void consumirPedido(Pedido pedido) {
        Pedido pedidoAtualizado = pedidoRepository.buscarPorId(pedido.getId()).orElseThrow();
        pedidoAtualizado.setStatus(PedidoStatus.ENVIADO_TRANSPORTADORA);
        pedidoRepository.salvar(pedidoAtualizado);
    }
}

