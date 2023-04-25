package test;

import main.dominio.Curso;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TesteCurso {

    @Test
    public void validaCurso(){
        Curso curso = new Curso("Culinária da Ingrid");

        Assertions.assertEquals("Culinária da Ingrid",curso.getNomeDoCurso());
    }

    @Test
    public void validaOutroCurso(){
        Curso cursoDois = new Curso("Finanças");

        Assertions.assertEquals("Finanças",cursoDois.getNomeDoCurso());
    }
}
