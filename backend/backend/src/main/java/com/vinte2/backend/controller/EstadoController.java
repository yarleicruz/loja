package com.vinte2.backend.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinte2.backend.entity.Estado;
import com.vinte2.backend.service.EstadoService;

@RestController
@RequestMapping ("/api/estado")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/")
    public java.util.List<Estado> buscarTodos(){
       return estadoService.buscarTodos();
    }

    @PostMapping("/")
    public Estado inserir (Estado estado){
        return estadoService.inserir(estado);

    }

    @PutMapping("/")
    public Estado alterar (Estado estado){
        return estadoService.alterar(estado);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity <Void> excluir(@PathParam("id")Long id){
        estadoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
