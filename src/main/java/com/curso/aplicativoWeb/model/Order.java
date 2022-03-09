package com.curso.aplicativoWeb.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrder;
    private String number;
    private Date creationDate;
    private Date dateReceived;
    private double total;

    @ManyToOne
    private User user;

    @OneToOne(mappedBy = "order")
    private DetailOrder detail;

    public Order() {
    }

    public Order(Integer idOrder, String number, Date creationDate, Date dateReceived, double total) {
        this.idOrder = idOrder;
        this.number = number;
        this.creationDate = creationDate;
        this.dateReceived = dateReceived;
        this.total = total;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DetailOrder getDetail() {
        return detail;
    }

    public void setDetail(DetailOrder detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", number='" + number + '\'' +
                ", creationDate=" + creationDate +
                ", dateReceived=" + dateReceived +
                ", total=" + total +
                '}';
    }
}
