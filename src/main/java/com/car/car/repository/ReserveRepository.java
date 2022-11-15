package com.car.car.repository;

import com.car.car.entity.Reserve;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve, Integer> {
    // Reserve findByRname(String rname);
    // Page<Reserve> findByRcarnumContaining(String searchKeyword, Pageable pageable);
    ArrayList<Reserve> findByRcarnumAndRt(String rcarnum, String rt);

    Reserve findByid(Integer id);

}
