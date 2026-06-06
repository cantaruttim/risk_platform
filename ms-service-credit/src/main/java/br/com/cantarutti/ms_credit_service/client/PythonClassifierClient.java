package br.com.cantarutti.ms_credit_service.client;

import br.com.cantarutti.ms_credit_service.records.CompanyDataRequest;
import br.com.cantarutti.ms_credit_service.records.RiskResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "python-classifier", url = "${python.classifier.url:http://python-classifier:8000}")
public interface PythonClassifierClient {
    @PostMapping("/classify")
    RiskResponse classify(@RequestBody CompanyDataRequest request);
}
