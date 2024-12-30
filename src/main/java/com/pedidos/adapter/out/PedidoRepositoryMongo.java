package com.pedidos.adapter.out;

import com.pedidos.domain.Pedido;
import com.pedidos.port.PedidoRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositoryMongo extends MongoRepository<Pedido, String>, PedidoRepository {
}

