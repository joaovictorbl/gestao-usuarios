package gestaousuariocom.br.service;

import gestaousuariocom.br.dto.Response;

public interface BuscarNomeUsuarioService {

    Response obterUsuarioPorNome(String nome);
}
