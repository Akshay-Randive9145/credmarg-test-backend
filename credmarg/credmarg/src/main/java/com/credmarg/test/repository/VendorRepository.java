package com.credmarg.test.repository;

import com.credmarg.test.entity.Vendors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendors, String> {
}
