package gestaousuariocom.br.service.impl;

import gestaousuariocom.br.dto.Request;
import gestaousuariocom.br.dto.Response;
import gestaousuariocom.br.repository.UsuarioRepository;
import gestaousuariocom.br.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public Response salvar(Request usuario) {
        return repository.salvar(usuario);
    }

    @Override
    public Response obterUsuarioPorNome(Request usuario) {
        return repository.findbyNome(usuario.getNome());
    }

}
