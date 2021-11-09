package com.store.retail.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "item_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_cat_id")
    int id;
    @Column(name = "item_cat_name")
    String catName;
    @Column(name = "item_cat_description")
    String catDescription;
    @Column(name = "bonus", nullable = false)
    boolean bonus;
//    @OneToMany(mappedBy = "itemCategory",fetch=FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
//    List<Item> items;
}
