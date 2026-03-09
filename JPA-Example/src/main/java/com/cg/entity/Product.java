package com.cg.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name="productdata")
public class Product {
    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", dom=" + dom +
                '}';
    }

    @Id
    @Column(name="product_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="my_seq")
//    @SequenceGenerator(name="my_seq",sequenceName = "prod_seq",allocationSize = 5,initialValue = 100)
    private int pid;
    @Column(name="product_name",nullable = true)
    private String name;
    @Column(name="product_price")
    private double price;
    //@Transient --->its column will not created in table
    @Column(name="product_qty")
    private int qty;
    @Column(name="product_dom")
    private LocalDate dom;

    public Product() {

    }
    public Product(String name,double price,int qty,LocalDate dom){
        super();
        //this.pid=pid;
        this.name=name;
        this.price=price;
        this.qty=qty;
        this.dom=dom;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public LocalDate getDom() {
        return dom;
    }

    public void setDom(LocalDate dom) {
        this.dom = dom;
    }
}
