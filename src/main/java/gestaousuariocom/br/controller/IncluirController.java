package gestaousuariocom.br.controller;

import gestaousuariocom.br.dto.Request;
import gestaousuariocom.br.dto.Response;
import gestaousuariocom.br.service.impl.IncluirUsuarioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class IncluirController {

    @Autowired
    private IncluirUsuarioImpl service;

    @PostMapping
    private ResponseEntity<Response> incluirUsuario(@RequestBody Request usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.incluirUsuario(usuario));
    }
}