package appPapelariaProf;

public class DadosEstoque {


    public String getNomeproduto() {
        return Nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        Nomeproduto = nomeproduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoUnitário() {
        return precoUnitário;
    }

    public void setPrecoUnitário(float precoUnitário) {
        this.precoUnitário = precoUnitário;
    }

    private String Nomeproduto;
    private String descricao;
    private int quantidade;
    private float precoUnitário;



}
