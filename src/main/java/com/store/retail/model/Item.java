package com.store.retail.model;


import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "item")
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    int id;
    @Column(name = "item_name")
    String name;
    @Column(name = "item_price")
    double price;

}
