package com.car.car.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String purpose; // 이용 목적

    private String dest; // 목적지

    private String rt; // 예약 시간

    private String rcarnum; // 예약 차 번호

    private String rname; // 예약자 이름
}
