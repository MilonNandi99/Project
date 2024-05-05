
package com.mobileStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileStock.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {

}
