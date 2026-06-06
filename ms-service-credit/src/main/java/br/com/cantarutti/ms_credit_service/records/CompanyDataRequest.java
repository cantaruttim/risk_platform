package br.com.cantarutti.ms_credit_service.records;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyDataRequest {

    @JsonProperty("receita_anual")
    private double receitaAnual;

    @JsonProperty("divida_total")
    private double dividaTotal;

    @JsonProperty("lucro_liquido")
    private double lucroLiquido;

    @JsonProperty("tempo_mercado")
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
