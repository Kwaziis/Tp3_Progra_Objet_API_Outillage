package com.tp_poo_apis.tp3;

import com.tp_poo_apis.tp3.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}

