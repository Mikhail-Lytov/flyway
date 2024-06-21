package com.example.test_fly_way.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @ColumnDefault("nextval('student_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "last_name", length = Integer.MAX_VALUE)
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_student")
    private StudentGroup groupStudent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "direct_student")
    private DirectStudent directStudent;

}