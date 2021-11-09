package com.store.retail.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BillResponse implements Serializable {

    String RequestId;
    List<Item> items;
    double total;
    double discountAmount;
    double finalAmount;
}
