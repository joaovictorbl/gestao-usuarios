package gestaousuariocom.br.controller;

import gestaousuariocom.br.dto.Response;
import gestaousuariocom.br.service.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class ObterNomeController {
    @Autowired
    private UsuarioServiceImpl service;

    @GetMapping("/{nome}")
    private ResponseEntity<Response> obterPorNome(@PathVariable String nome){
        return ResponseEntity.ok().body(service.obterUsuarioPorNome(nome));
    }
}
