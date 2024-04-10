package com.fretes.azchip.v1.dominio.ports.repositories;

import com.fretes.azchip.v1.dominio.model.EnderecoDestinatario;

public interface EnderecoDestinatarioRepositoryPort {
    
    EnderecoDestinatario cadastrarEnderecoDestinatario(EnderecoDestinatario enderecoDto);
    
}
