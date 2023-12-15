package com.SystemVaccine.Models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity //patient is a entity so we annotate as entity patient
@Table(name = "patient")
public class Patient {

    @Id //make this field as unique id
    @GeneratedValue(strategy = GenerationType.AUTO) //automatically unique id will be generated, id's will be in combination of text and num eg;10Xf0350j
    UUID id; //this id contains data UUID type

    String name;
    String gender;

    @Column(unique = true)
    int adhar_number;
    int dosecount;
    String vaccinationPreference;
    String address;
    @Column(unique = true) //i want phone number to be unique
    long ph_no;
    @Column(unique = true)
    String email;


    public Patient(UUID id, String name, String gender, int adhar_number, int dosecount, String vaccinationPreference, String address, long ph_no, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.adhar_number = adhar_number;
        this.dosecount = dosecount;
        this.vaccinationPreference = vaccinationPreference;
        this.address = address;
        this.ph_no = ph_no;
        this.email = email;
    }

    public Patient(){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAdhar_number() {
        return adhar_number;
    }

    public void setAdhar_number(int adhar_number) {
        this.adhar_number = adhar_number;
    }

    public int getDosecount() {
        return dosecount;
    }

    public void setDosecount(int dosecount) {
        this.dosecount = dosecount;
    }

    public String getVaccinationPreference() {
        return vaccinationPreference;
    }

    public void setVaccinationPreference(String vaccinationPreference) {
        this.vaccinationPreference = vaccinationPreference;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPh_no() {
        return ph_no;
    }

    public void setPh_no(long ph_no) {
        this.ph_no = ph_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
