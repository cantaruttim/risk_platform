package br.com.cantarutti.ms_credit_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cantarutti.ms_credit_service.records.CompanyDataRequest;
import br.com.cantarutti.ms_credit_service.records.RiskResponse;
import br.com.cantarutti.ms_credit_service.service.CreditService;

@RestController
@RequestMapping("/api/credit/")
public class CreditController {
    @Autowired
    private CreditService creditService;

    @PostMapping("/classify")
    public RiskResponse classify(@RequestBody CompanyDataRequest request) {
        return creditService.classifyCompany(request);
    }
}
