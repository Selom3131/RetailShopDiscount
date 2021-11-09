package com.store.retail.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
//@Entity
//@Table(name = "item_order")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemOrder {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "itemId")
    int itemId;
//    @Column(name = "quantity")
    int quantity;
//    @OneToOne(mappedBy = "")
//    int shopUserId;


}
