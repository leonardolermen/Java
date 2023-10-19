package com.example.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @GetMapping("/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.779.00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientPorId(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name  = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Pedro Henrique", "111.222.333-44");
    }
}