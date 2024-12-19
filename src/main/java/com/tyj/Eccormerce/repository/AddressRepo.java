package com.tyj.Eccormerce.repository;

import com.tyj.Eccormerce.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository <Address, Long> {
}
