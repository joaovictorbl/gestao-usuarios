package gestaousuariocom.br.service.impl;

import gestaousuariocom.br.domain.Usuario;
import gestaousuariocom.br.dto.Response;
import gestaousuariocom.br.mapper.request.RequestMapper;
import gestaousuariocom.br.mapper.response.ResponseMapper;
import gestaousuariocom.br.repository.UsuarioRepository;
import gestaousuariocom.br.service.BuscarNomeUsuarioService;
import org.hibernate.annotations.NaturalId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuscarNomeUsuarioImpl implements BuscarNomeUsuarioService {

    @NaturalId
    UsuarioRepository repository;

    @Autowired(required = false)
    private RequestMapper requestMapper;

    @Autowired(required = false)
    private ResponseMapper responseMapper;

    @Override
    public Response obterUsuarioPorNome(String nome) {
        Usuario usuario = repository.findByNome(nome);
        return responseMapper.usuarioToResponse(usuario);
    }
}
