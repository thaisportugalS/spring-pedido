package com.pedidos.usecase;

import com.pedidos.domain.Pedido;
import com.pedidos.port.PedidoRepository;
import com.pedidos.port.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class CriarPedidoUseCase implements PedidoService {

    private final PedidoRepository pedidoRepository;

    public CriarPedidoUseCase(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public Pedido criarPedido(Pedido pedido) {
        pedido.setStatus(PedidoStatus.AGUARDANDO_ENVIO);
        return pedidoRepository.salvar(pedido);
    }

    @Override
    public Pedido consultarPedido(String id) {
        return pedidoRepository.buscarPorId(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }
}

