package main.dominio;

public class Cidade {
    private String descricao;

    private Estado estado;

    public Cidade(String descricao, Estado estado) {
        this.descricao = descricao;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
