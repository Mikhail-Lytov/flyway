package com.example.test_fly_way.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "student_group")
public class StudentGroup {
    @Id
    @ColumnDefault("nextval('student_group_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "code", length = Integer.MAX_VALUE)
    private String code;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

}