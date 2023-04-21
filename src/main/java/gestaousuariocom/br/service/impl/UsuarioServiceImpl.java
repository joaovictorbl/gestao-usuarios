package gestaousuariocom.br.service.impl;

import gestaousuariocom.br.domain.Usuario;
import gestaousuariocom.br.dto.Request;
import gestaousuariocom.br.dto.Response;
import gestaousuariocom.br.mapper.request.RequestMapper;
import gestaousuariocom.br.mapper.response.ResponseMapper;
import gestaousuariocom.br.repository.UsuarioRepository;
import gestaousuariocom.br.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired(required = false)
    private RequestMapper requestMapper;

    @Autowired(required = false)
    private ResponseMapper responseMapper;

    @Override
    public Response incluirUsuario(Request usuario) {
        Usuario usuarioNovo = requestMapper.requestToUsuario(usuario);
        repository.save(usuarioNovo);
        return responseMapper.usuarioToResponse(usuarioNovo);
    }

    @Override
    public Response obterUsuarioPorNome(String nome) {
        Usuario usuario = repository.findByNome(nome);
        return responseMapper.usuarioToResponse(usuario);
    }
}
