package com.car.car.service;

import com.car.car.entity.Car;
import com.car.car.entity.Reserve;
import com.car.car.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReserveService {
    @Autowired
    private ReserveRepository reserveRepository;

    public void create(Reserve reserve){
        reserveRepository.save(reserve);
    } // post한 내용 저장

    public Page<Reserve> reserveList(Pageable pageable) {

        return reserveRepository.findAll(pageable); // SELECT * FROM 조건없이 테이블의 모든 튜플을 가져온다.
    }


    public Optional<Reserve> reserveList1(Integer id) {
        return reserveRepository.findById(id);
    }

    /*public Page<Reserve> reserveSearchList(String searchKeyword, Pageable pageable){
        return reserveRepository.findByRcarnumContaining(searchKeyword, pageable);
    }*/

    public ArrayList<Reserve> reserveSearchList(String rcarnum, String rt){
        return reserveRepository.findByRcarnumAndRt(rcarnum, rt);
    }

    public List<Reserve> reserveList(){
        return reserveRepository.findAll();
    }

    public void reserveDelete(Integer id) {
        reserveRepository.deleteById(id);
    }

    public Reserve reserveView(Integer id) {

        return reserveRepository.findByid(id); // id 값을 받아온다.
    }

}
