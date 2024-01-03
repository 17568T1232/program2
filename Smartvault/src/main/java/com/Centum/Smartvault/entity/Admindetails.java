package com.Centum.Smartvault.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Admindetails {
    @Id
    @Column(name="admindetails")
    public int AdminId;
    public String AdminName;


}
