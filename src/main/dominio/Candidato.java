package main.dominio;

import java.util.List;

public class Candidato {

    private String nome;
    private List<Telefone> telefones;
    private int cpf;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Candidato(String nome, List<Telefone> telefones) {
        this.nome = nome;
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarTelefone(Telefone telefone) {
        if (telefones.size() < 3) {
           telefones.add(telefone);
        } else {
            System.out.println("Atingido o limite máximo de telefones (3) para o candidato.");
        }
    }
}