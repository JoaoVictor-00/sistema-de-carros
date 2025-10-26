package com.sistemadecarros;

import jakarta.persistence.*;

// Entity transforma uma classe em entidade no banco de dados
@Entity
@Table(name = "tb_cadastro_de_carros")
public class CarrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String marca;
    String modelo;
    int ano;


    public CarrosModel(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public CarrosModel() {
    }
}