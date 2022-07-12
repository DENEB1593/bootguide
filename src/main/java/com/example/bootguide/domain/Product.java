package com.example.bootguide.domain;

import com.example.bootguide.common.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Entity
@Table(name = "product")
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* 채번 생성을 DB 기본전략으로 지정 */
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    Integer price;

    @Column(nullable = false)
    Integer stock;

}
