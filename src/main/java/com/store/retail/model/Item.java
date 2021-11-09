package com.store.retail.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "item")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    int id;
    @Column(name = "item_name")
    String name;
    @Column(name = "item_price")
    double price;
    @ManyToOne
    @JoinColumn(name = "item_cat_id")
    ItemCategory itemCategory;

}
