package com.Centum.Smartvault.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="userdetails")
public class Userdetails {
    public int userid;
    public String UserName;
    public String Emailid;
    public String UserPassword;
    public String Phonenumber;
    public String Accountnumber;
    public String Cardnumber;
    public String Lockerid;
    public String Pin;





}
