package com.example.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "carts")

public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long id;

    @Column(name = "package_price")
    private BigDecimal package_price;

    @Column(name = "party_size")
    private int party_size;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusType statusType;

    @Column(name = "order_tracking_number")
    private String orderTrackingNumber;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
    private Set<CartItem> cartItems = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public void add(CartItem cartItem){
        this.cartItems.add(cartItem);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPackage_price() {
        return package_price;
    }

    public void setPackage_price(BigDecimal package_price) {
        this.package_price = package_price;
    }

    public Integer getParty_size() {
        return party_size;
    }

    public void setParty_size(Integer party_size) {
        this.party_size = party_size;
    }

    public StatusType getStatus() {
        return statusType;
    }

    public void setStatus(StatusType statusType) {
        this.statusType = statusType;
    }

    public String getOrderTrackingNumber() {
        return orderTrackingNumber;
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public Set<CartItem> getCartItem() {
        return cartItems;
    }

    public void setCartItem(Set<CartItem> cartItem) {
        this.cartItems = cartItem;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
