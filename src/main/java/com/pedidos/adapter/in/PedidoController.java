package com.pedidos.adapter.in;

import com.pedidos.port.PedidoService;
import com.pedidos.domain.Pedido;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.criarPedido(pedido);
    }

    @GetMapping("/{id}")
    public Pedido consultarPedido(@PathVariable String id) {
        return pedidoService.consultarPedido(id);
    }
}


