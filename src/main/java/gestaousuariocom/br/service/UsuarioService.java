package gestaousuariocom.br.service;

import gestaousuariocom.br.dto.Request;
import gestaousuariocom.br.dto.Response;

public interface UsuarioService {
    Response incluirUsuario(Request usuario);

    Response obterUsuarioPorNome(String nome);
}
