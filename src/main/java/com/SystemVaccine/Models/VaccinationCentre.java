package com.SystemVaccine.Models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "vaccination_centre")
public class VaccinationCentre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    String type;
    int coVaxinCount;
    int covShieldCount;
    int sputnikCount;
    int doctorCount;
    int patientCount;
    String address;

    @OneToMany
    List<Doctor> doctorList; //this means in one vaccination centre multiple doctors are working
    //and it's bidirection if you see between vacc ctr and doctor that means vaccination centre has one to many relationship with doctor and doctor has many to one relationship with vacc centre so it's bidirectional relationship


    public VaccinationCentre(UUID id, String name, String type, int coVaxinCount, int covShieldCount, int sputnikCount, int doctorCount, int patientCount, String address, List<Doctor> doctorList) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.coVaxinCount = coVaxinCount;
        this.covShieldCount = covShieldCount;
        this.sputnikCount = sputnikCount;
        this.doctorCount = doctorCount;
        this.patientCount = patientCount;
        this.address = address;
        this.doctorList = doctorList;
    }

    public VaccinationCentre() {

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCoVaxinCount() {
        return coVaxinCount;
    }

    public void setCoVaxinCount(int coVaxinCount) {
        this.coVaxinCount = coVaxinCount;
    }

    public int getCovShieldCount() {
        return covShieldCount;
    }

    public void setCovShieldCount(int covShieldCount) {
        this.covShieldCount = covShieldCount;
    }

    public int getSputnikCount() {
        return sputnikCount;
    }

    public void setSputnikCount(int sputnikCount) {
        this.sputnikCount = sputnikCount;
    }

    public int getDoctorCount() {
        return doctorCount;
    }

    public void setDoctorCount(int doctorCount) {
        this.doctorCount = doctorCount;
    }

    public int getPatientCount() {
        return patientCount;
    }

    public void setPatientCount(int patientCount) {
        this.patientCount = patientCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
}
