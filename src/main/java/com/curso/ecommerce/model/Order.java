package com.curso.ecommerce.model;

import java.util.Date;

public class Order {

    private Integer idOrder;
    private String number;
    private Date creationDate;
    private Date dateReceived;
    private double total;

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
