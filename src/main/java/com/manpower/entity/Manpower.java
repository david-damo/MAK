
package com.manpower.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Manpower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private int hkFemalePresent;
    private int hkFemaleAbsent;
    private int hkMalePresent;
    private int technicianPresent;
    private int plumberPresent;

    // getters & setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public LocalDate getDate(){return date;}
    public void setDate(LocalDate date){this.date=date;}
    public int getHkFemalePresent(){return hkFemalePresent;}
    public void setHkFemalePresent(int v){this.hkFemalePresent=v;}
    public int getHkFemaleAbsent(){return hkFemaleAbsent;}
    public void setHkFemaleAbsent(int v){this.hkFemaleAbsent=v;}
    public int getHkMalePresent(){return hkMalePresent;}
    public void setHkMalePresent(int v){this.hkMalePresent=v;}
    public int getTechnicianPresent(){return technicianPresent;}
    public void setTechnicianPresent(int v){this.technicianPresent=v;}
    public int getPlumberPresent(){return plumberPresent;}
    public void setPlumberPresent(int v){this.plumberPresent=v;}
}