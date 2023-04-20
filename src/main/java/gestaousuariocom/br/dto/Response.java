package gestaousuariocom.br.dto;

import lombok.Data;

@Data
public class Response {

    private String nome;
    private String email;

    private Response(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
