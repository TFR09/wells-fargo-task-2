package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;
    @Column(nullable = false)
    private Date creationDate;
    @OneToOne
    private Client clientID;
    @OneToMany
    private List<Security> securities = new ArrayList<>();

    public Portfolio() {

    }
    public Portfolio(Date creationDate) {
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClientID() {
        return clientID;
    }

    public void setClientID(Client clientID) {
        this.clientID = clientID;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
