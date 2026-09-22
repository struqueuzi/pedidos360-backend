package com.Pedidos360.pedidos360;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {

    @GetMapping
    public String obtenerPedidos() {
        return "¡Token válido! Aquí están los datos protegidos del backend.";
    }
}