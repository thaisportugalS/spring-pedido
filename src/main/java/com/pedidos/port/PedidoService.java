package com.pedidos.port;

import com.pedidos.domain.Pedido;

public interface PedidoService {
    Pedido criarPedido(Pedido pedido);
    Pedido consultarPedido(String id);
}
