package gestaousuariocom.br.mapper.request;

import gestaousuariocom.br.domain.Usuario;
import gestaousuariocom.br.dto.Request;
import org.mapstruct.Mapper;

@Mapper
public interface RequestMapper {

    Usuario requestToUsuario(Request request);
}
