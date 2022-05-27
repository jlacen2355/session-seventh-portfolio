package com.portfolio.sessioneight.controller;

import com.portfolio.sessioneight.model.*;
import com.portfolio.sessioneight.model.service.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIController {

    @Autowired
    private APIService apiService;

    @GetMapping(value = "/api/service")
    public List<PortfolioService> getServices(){
        return apiService.getAllServices();
    }

    @PostMapping(value = "api/service")
    public PortfolioService createService(@RequestBody PortfolioService portfolioService){
        System.out.println(portfolioService);
        return apiService.saveService(portfolioService);
    }

    @PutMapping(value = "api/service/{id}")
    public String updateService(@PathVariable(name = "id") Integer id, @RequestBody PortfolioService portfolioService){
        System.out.println(id);
        System.out.println(portfolioService);
        PortfolioService updatedService = apiService.updateService(id, portfolioService);
        if(updatedService == null){
            return "error";
        }
        return "Sucess";
    }

    @DeleteMapping(value = "api/service/{id}")
    public String deleteService(@PathVariable(name = "id") Integer id){
        apiService.deleteService(id);
        return "Success";
    }



}
