/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

/**
 *
 * @author rafhael
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{
    Customer findByEmail(String mail);
    
    @Query("select c from Customer c where c.phone = ?1")
    Customer findByPhone(String phone);
    
     
}
