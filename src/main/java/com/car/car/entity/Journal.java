package com.car.car.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.EntityListeners;

import javax.persistence.*;
import java.time.LocalDateTime;
@EnableJpaAuditing
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Journal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String jkm; // 주행거리

    private String condi; // 차량 상태

    private String uni; // 특이 사항

    private String jname; // 운행자 이름

    private String jcarnum; // 운행차 번호

    private String jrt; // 예약 시간

    private String jdest; // 행선지

    private String jpurpose; // 운행 목적

    @CreatedDate
    private LocalDateTime date; // 작성시간
}
