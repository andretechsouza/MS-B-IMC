package br.com.microservico.imc.dto;


public class IMCDTO {

    private String nome;

    private float imc;

    private String msg;

    public IMCDTO() {
    }

    public IMCDTO(String nome, float imc, String msg) {
        this.nome = nome;
        this.imc = imc;
        this.msg = msg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "IMCDTO{" +
                "nome='" + nome + '\'' +
                ", imc=" + imc +
                ", msg='" + msg + '\'' +
                '}';
    }
}
