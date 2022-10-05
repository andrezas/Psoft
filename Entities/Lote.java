package Entities;

import java.util.Date;
import java.util.Objects;

public class Lote {

    private int quantidade;
    private Date dataValidade;
    private Produto produto;

    public Lote(int quantidade, Date dataValidade, Produto produto) {
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "quantidade=" + quantidade +
                ", dataValidade=" + dataValidade +
                ", produto=" + produto +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuantidade(), getDataValidade(), getProduto());
    }
}
