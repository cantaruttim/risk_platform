package br.com.cantarutti.ms_credit_service.records;

import java.util.Map;

public class RiskResponse {
 private String riscoCredito;
    private Map<String, Double> probabilidades;

    public String getRiscoCredito() { return riscoCredito; }
    public void setRiscoCredito(String riscoCredito) { this.riscoCredito = riscoCredito; }
    public Map<String, Double> getProbabilidades() { return probabilidades; }
    public void setProbabilidades(Map<String, Double> probabilidades) { this.probabilidades = probabilidades; }   
}
