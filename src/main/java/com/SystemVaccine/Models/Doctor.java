package com.SystemVaccine.Models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    String docDegree;


    //entity relationship
    @ManyToOne //this means if you see doctor point of view many doctor can go to one vaccination centre
    VaccinationCentre vaccinationCentre;

    int patient_count;

    @OneToMany //this means one docotor could have multiple patients/ or list of patients
    List<Patient> patientList;

    public Doctor(UUID id, String name, String docDegree, VaccinationCentre vaccinationCentre, int patient_count, List<Patient> patientList) {
        this.id = id;
        this.name = name;
        this.docDegree = docDegree;
        this.vaccinationCentre = vaccinationCentre;
        this.patient_count = patient_count;
        this.patientList = patientList;
    }

    public Doctor() {
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

    public String getDocDegree() {
        return docDegree;
    }

    public void setDocDegree(String docDegree) {
        this.docDegree = docDegree;
    }

    public VaccinationCentre getVaccinationCentre() {
        return vaccinationCentre;
    }

    public void setVaccinationCentre(VaccinationCentre vaccinationCentre) {
        this.vaccinationCentre = vaccinationCentre;
    }

    public int getPatient_count() {
        return patient_count;
    }

    public void setPatient_count(int patient_count) {
        this.patient_count = patient_count;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}
