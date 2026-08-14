package br.com.cantarutti.ms_credit_service.records;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyDataRequest {

    @JsonProperty("receita_anual")
    private double receita_anual;

    @JsonProperty("divida_total")
    private double divida_total;

    @JsonProperty("lucro_liquido")
    private double lucro_liquido;

    @JsonProperty("tempo_mercado")
    private int tempo_mercado;

    public double getReceitaAnual() { return receita_anual; }
    public void setReceitaAnual(double receita_anual) { this.receita_anual = receita_anual; }
    public double getDividaTotal() { return divida_total; }
    public void setDividaTotal(double divida_total) { this.divida_total = divida_total; }
    public double getLucroLiquido() { return lucro_liquido; }
    public void setLucroLiquido(double lucro_liquido) { this.lucro_liquido = lucro_liquido; }
    public int getTempoMercado() { return tempo_mercado; }
    public void setTempoMercado(int tempo_mercado) { this.tempo_mercado = tempo_mercado; }
}
