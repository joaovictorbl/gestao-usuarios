package gestaousuariocom.br.mapper.response;

import gestaousuariocom.br.domain.Usuario;
import gestaousuariocom.br.dto.Response;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResponseMapper {

    Response usuarioToResponse(Usuario usuario);
}
