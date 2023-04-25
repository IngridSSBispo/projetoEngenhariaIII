package main.model;

import main.dominio.EntidadeDominio;

public interface InterfaceDAO {

    public void create(EntidadeDominio entidadeDominio);

    public void read(EntidadeDominio entidadeDominio);

    public void update(EntidadeDominio entidadeDominio);

    public void delete(EntidadeDominio entidadeDominio);
}

