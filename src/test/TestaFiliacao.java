package test;

import main.dominio.Filiacao;
import org.junit.Assert;
import org.junit.Test;

public class TestaFiliacao {

    @Test
    public void validaFiliacao(){

        Filiacao filiacao = new Filiacao("Marta");
        Assert.assertEquals("Marta",filiacao.getNomeMae());
    }
}
