package test;

import main.dominio.Cidade;
import main.dominio.Endereco;
import main.dominio.Estado;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class TesteEndereco {

    @Test
    public void novoEndereco(){
        Estado estado = new Estado("São Paulo");
        Cidade cidade = new Cidade("Poá", estado);

        Endereco endereco = new Endereco(
             "Avenida Nove de Julho",
             1000,
             8555500,
             cidade
        );

        Assertions.assertEquals("Avenida Nove de Junho", endereco.getLogradouro());
    }
}
