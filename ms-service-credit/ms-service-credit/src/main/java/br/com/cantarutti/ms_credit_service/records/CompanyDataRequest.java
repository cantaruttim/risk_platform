package br.com.cantarutti.ms_credit_service.records;

public class CompanyDataRequest {
    private double receitaAnual;
    private double dividaTotal;
    private double lucroLiquido;
    private int tempoMercado;

    public double getReceitaAnual() { return receitaAnual; }
    public void setReceitaAnual(double receitaAnual) { this.receitaAnual = receitaAnual; }
    public double getDividaTotal() { return dividaTotal; }
    public void setDividaTotal(double dividaTotal) { this.dividaTotal = dividaTotal; }
    public double getLucroLiquido() { return lucroLiquido; }
    public void setLucroLiquido(double lucroLiquido) { this.lucroLiquido = lucroLiquido; }
    public int getTempoMercado() { return tempoMercado; }
    public void setTempoMercado(int tempoMercado) { this.tempoMercado = tempoMercado; }
}
