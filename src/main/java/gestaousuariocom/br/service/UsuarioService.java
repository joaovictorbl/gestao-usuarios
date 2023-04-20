package gestaousuariocom.br.service;

import gestaousuariocom.br.dto.Request;
import gestaousuariocom.br.dto.Response;

import java.util.Optional;

public interface UsuarioService {

    Response salvar(Request usuario);

    Optional<Response> obterUsuario(Request usuario);
}
