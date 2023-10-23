package com.pizzaria.sis_pedido.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizzaria.sis_pedido.model.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByClienteNome(String clienteNome);

    Cliente findByClienteCPF(Long clienteCPF);

    Cliente findByUsuarioId(Integer usuarioId);
    
    Cliente findByIdCliente(Integer idCliente);
}
