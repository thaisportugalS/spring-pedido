package com.pedidos.port;

import com.pedidos.domain.Pedido;
import java.util.Optional;

public interface PedidoRepository {
    Pedido salvar(Pedido pedido);
    Optional<Pedido> buscarPorId(String id);
}

