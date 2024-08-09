package gestaousuariocom.br.repository;

import gestaousuariocom.br.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    @Query("select u from Usuario u where u.nome=:nome")
    Usuario findByNome(String nome);

}
