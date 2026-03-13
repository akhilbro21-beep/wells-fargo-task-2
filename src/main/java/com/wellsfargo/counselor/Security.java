package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name="portfolioId", nullable=false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String securityType;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    protected Security() {}

    public Security(Portfolio portfolio, String securityName, String securityType, float purchasePrice, Date purchaseDate) {
        this.portfolio = portfolio;
        this.securityName = securityName;
        this.securityType = securityType;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
    }

    public Long getSecurityId() { return securityId; }
    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
    public String getSecurityName() { return securityName; }
    public void setSecurityName(String securityName) { this.securityName = securityName; }
    public String getSecurityType() { return securityType; }
    public void setSecurityType(String securityType) { this.securityType = securityType; }
    public float getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(float purchasePrice) { this.purchasePrice = purchasePrice; }
    public Date getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }
}