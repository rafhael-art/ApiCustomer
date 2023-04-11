/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.controller;

import java.lang.invoke.MethodHandle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerce.ApiCustomer.service.CustomerSevice;

/**
 *
 * @author rafhael
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    
    @Autowired
    CustomerSevice customerService;
    
    @GetMapping("/findAll")
    public List<Customer> findAll(){
        return customerService.findAll();
    }
    
    @GetMapping("/findById/{id}")
    public Customer findById( @PathVariable Long id){
        return customerService.findById(id);
    }
    
    @GetMapping("/findByEmail/{mail}")
    public Customer findByEmail(@PathVariable String mail){
        return customerService.findByEmail(mail);
    }
    
    @GetMapping("/findByPhone")
    public Customer BuscarPorCelular(@RequestParam String phone){
        return customerService.findByPhone(phone);
    }
    
    @PostMapping("/add")
    public Customer add(@RequestBody Customer data){
        return customerService.add(data);
    }
    
    @PutMapping("/edit/{id}")
    public Customer edit( @PathVariable Long id,@RequestBody Customer data){
        return customerService.update(id,data);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete( @PathVariable Long id){
        customerService.delete(id);
    }
}
