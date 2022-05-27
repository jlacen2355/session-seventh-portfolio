package com.portfolio.sessioneight.model.service;

import com.portfolio.sessioneight.model.PortfolioService;
import com.portfolio.sessioneight.repository.PortfolioServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class APIService {

    @Autowired
    private PortfolioServiceRepository portfolioServiceRepository;

    public List<PortfolioService> getAllServices(){
        List<PortfolioService> services = new ArrayList<>();
        portfolioServiceRepository.findAll().forEach(services::add);
        return services;
    }

    public PortfolioService saveService(PortfolioService portfolioService) {
        return portfolioServiceRepository.save(portfolioService);
    }


    public PortfolioService updateService(Integer id, PortfolioService portfolioService){
       Optional<PortfolioService> optionalService = portfolioServiceRepository.findById(id);

       if (optionalService.isPresent()){
           PortfolioService updateableService = optionalService.get();
           updateableService.setServiceName(portfolioService.getServiceName());
           updateableService.setServiceDescription(portfolioService.getServiceDescription());
           updateableService.setServiceIcon(portfolioService.getServiceIcon());

           return portfolioServiceRepository.save(updateableService);
       }else {
           return null;
       }
    }

    public String deleteService(Integer id){
        portfolioServiceRepository.deleteById(id);
        return "Success";
    }

}
