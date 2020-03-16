package com.jmj.test.springboot.sbtest.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fornavn;
    private String etternavn;
    private Integer adresseid;

    public Person(){

    }

    public Person(String fornavn){
        this.fornavn = fornavn;
    }

    public Person(String fornavn, String etternavn){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public Integer getAdresseid() {
        return adresseid;
    }

    public void setAdresseid(Integer adresseid) {
        this.adresseid = adresseid;
    }

    @Override
    public String toString(){
        return "Person{}" +
                "id=" + id +
                " fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\''+
                ", adresseid='" + adresseid + '\''+
                '}'
                ;
    }
}
