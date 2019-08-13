package com.empresa.models.dao;
import org.springframework.data.repository.CrudRepository;

import com.empresa.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
