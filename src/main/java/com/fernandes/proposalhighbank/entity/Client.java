package com.fernandes.proposalhighbank.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surName;

    private String cpf;

    private String phone;

    private Double salary;

    @OneToOne(mappedBy = "client")
    private Proposal proposal;

}
