package org.example.domain.DTOs.cliente;

import org.example.domain.entities.CompraCliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCliente extends JpaRepository<CompraCliente, String> {
    Page<CompraCliente> findAll(Pageable paginacao);
}
