package com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.services;

import com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.models.ISSLCustomer;
import com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.repositories.ISSLCustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ISSLCustomerServices {

    @Autowired
    ISSLCustomerRepo isslCustomerRepo;

    public ISSLCustomer addCustomer(ISSLCustomer isslCustomer){

      isslCustomer.setCustomerCode(UUID.randomUUID().toString());

      return isslCustomerRepo.save(isslCustomer);
    }

    public List<ISSLCustomer> findAllCustomers(){
        return  isslCustomerRepo.findAll();
    }
    public ISSLCustomer updateAllCustomer(ISSLCustomer isslCustomer){

        return isslCustomerRepo.save(isslCustomer);

    }
 public  ISSLCustomer findCustomerById(Long id){

     return isslCustomerRepo.findById(id).get();
 }


    public  void deleteCustomer(Long id){

        isslCustomerRepo.deleteById(id);
    }

    public List<ISSLCustomer> findAllStaff() {

        return null;
    }
}
