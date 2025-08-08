package com.example.donation;

import jakarta.persistence.*;

@Entity
@Table(name = "donors")
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private double amount;

    public Donor() {}

    public Donor(String name, String email, double amount) {
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}