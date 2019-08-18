package com.empresa.models.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
