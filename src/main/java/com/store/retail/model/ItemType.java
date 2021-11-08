package com.store.retail.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "item_type")
@Data
public class ItemType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "type_id")
    int id;
    @Column(name = "type_name")
    String typeName;
    @Column(name = "type_description")
    String typeDescription;
}
