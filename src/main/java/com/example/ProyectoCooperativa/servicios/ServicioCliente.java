package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ServicioCliente {

    public List<Cliente>listarClientes();
    public Cliente guardarClientes(Cliente cliente);
    public Cliente consultarClientesPorId(Integer documento);
    public Cliente actualizarClientes(Cliente cliente);
    public void eliminarClientes(Integer documento);
}
