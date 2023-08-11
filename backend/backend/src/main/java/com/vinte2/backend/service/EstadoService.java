package com.vinte2.backend.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinte2.backend.entity.Estado;
import com.vinte2.backend.repository.EstadoRepository;

@Service
public class EstadoService {

    @Autowired
     private EstadoRepository estadoRepository;

     public List<Estado> buscarTodos(){
        return estadoRepository.findAll();
     }

     public Estado inserir(Estado estado){
         estado.setDataCriacao(new Date(0));
        Estado estadoNovo = estadoRepository.saveAndFlush(estado);
        return estadoNovo;

     }

     public Estado alterar(Estado estado){
        estado.setDataAtualizacao(new Date(0));
     return estadoRepository.saveAndFlush(estado);
     }
    
     public void excluir(Long id){

        Estado estado = estadoRepository.findById(id) .get();
        estadoRepository.delete(estado);

     }
}
