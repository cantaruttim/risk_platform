package br.com.cantarutti.ms_credit_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cantarutti.ms_credit_service.client.PythonClassifierClient;
import br.com.cantarutti.ms_credit_service.records.CompanyDataRequest;
import br.com.cantarutti.ms_credit_service.records.RiskResponse;

@Service
public class CreditService {
    
    @Autowired
    private PythonClassifierClient pythonClient;

    public RiskResponse classifyCompany(CompanyDataRequest request) {
        // Chama o serviço Python e retorna a resposta
        return pythonClient.classify(request);
    }

}
