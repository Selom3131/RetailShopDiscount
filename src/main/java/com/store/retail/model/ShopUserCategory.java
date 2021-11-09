package com.store.retail.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shop_user_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopUserCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cat_id")
    int id;
    @Column(name = "cat_description")
    String typeName;
    @Column(name="discount")
    double discount;

//    @OneToMany(mappedBy = "shopUserCategory")
//    List<ShopUser> shopUsers;
}
