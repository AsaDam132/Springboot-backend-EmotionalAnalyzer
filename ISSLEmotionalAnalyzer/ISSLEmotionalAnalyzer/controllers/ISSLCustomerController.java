package com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.controllers;

import com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.models.ISSLCustomer;
import com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.services.ISSLCustomerServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class ISSLCustomerController {

 private  final ISSLCustomerServices isslCustomerServices;

    public ISSLCustomerController(ISSLCustomerServices isslCustomerServices) {
        this.isslCustomerServices = isslCustomerServices;
    }
//   public ISSLCustomerController(ISSLCus
//  tomerServices isslCustomerServices) {
//      this.isslCustomerServices = isslCustomerServices;
//   }


    @GetMapping("/all")
        public ResponseEntity<List<ISSLCustomer>> getAllCustomers(){
            List<ISSLCustomer> customers = isslCustomerServices.findAllStaff();
            return new ResponseEntity<>(customers, HttpStatus.OK);
        }

        @GetMapping("/find/{id}")
        public ResponseEntity<ISSLCustomer> getEmployeeById(@PathVariable("id") Long id) {
            ISSLCustomer customer = isslCustomerServices.findCustomerById(id);
            return new ResponseEntity<>(customer, HttpStatus.OK);
        }

        @PostMapping("/add")
        public ResponseEntity<ISSLCustomer> addEmployee(@RequestBody ISSLCustomer isslCustomer) {
            ISSLCustomer newCustomer = isslCustomerServices.addCustomer(isslCustomer);
            return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
        }

        @PutMapping("/update")
        public ResponseEntity<ISSLCustomer> updateEmployee(@RequestBody ISSLCustomer isslCustomer) {
            ISSLCustomer updateCustomer = isslCustomerServices.updateAllCustomer(isslCustomer);
            return new ResponseEntity<>(updateCustomer, HttpStatus.OK);
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<?> deleteCustomer(@PathVariable("id") Long id) {
            isslCustomerServices.deleteCustomer(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
