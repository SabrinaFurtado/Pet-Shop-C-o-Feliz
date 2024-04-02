package com.facvest.petshopcaofeliz.model;


import jakarta.persistence.*;


@Entity
@Table(name = "tb_faleconosco")
public class FaleConosco {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String celular;
    private String mensagem;
    private String contatoPreferencial;
    private boolean receberPromocionais;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getContatoPreferencial() {
        return contatoPreferencial;
    }

    public void setContatoPreferencial(String contatoPreferencial) {
        this.contatoPreferencial = contatoPreferencial;
    }

    public boolean isReceberPromocionais() {
        return receberPromocionais;
    }

    public void setReceberPromocionais(boolean receberPromocionais) {
        this.receberPromocionais = receberPromocionais;
    }
}
