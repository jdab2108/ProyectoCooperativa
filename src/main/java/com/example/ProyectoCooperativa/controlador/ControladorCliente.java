package com.example.ProyectoCooperativa.controlador;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.servicios.ServicioImpCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cliente")
@RestController

public class ControladorCliente {

    @Autowired
    private ServicioImpCliente sic;

    @GetMapping
    public List<Cliente> listar(){
        return sic.listarClientes();
    }

    @PostMapping
    public Cliente insertar(@RequestBody Cliente cli){
        return sic.guardarClientes(cli) ;  //retorna a la URl cliente que está en requestMapping
    }

    @PutMapping
    public Cliente actualizar(@RequestBody Cliente cli){
        return sic.actualizarClientes(cli);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Cliente cli){
        sic.eliminarClientes(cli.getDocumento());
    }
}


