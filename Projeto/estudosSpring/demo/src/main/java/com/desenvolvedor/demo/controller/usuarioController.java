package com.desenvolvedor.demo.controller;

import com.desenvolvedor.demo.business.UsuarioService;
import com.desenvolvedor.demo.infra.entity.UsuarioConta;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class usuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioConta> salvaUsuario(@RequestBody UsuarioConta usuario ){
     return ResponseEntity.ok(usuarioService.salvaUsuario (usuario));

    }
}
