package gestaousuariocom.br.repository;

import gestaousuariocom.br.domain.Usuario;
import gestaousuariocom.br.dto.Request;
import gestaousuariocom.br.dto.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    Response findbyNome(String nome);

    Response salvar(Request usuario);

}
