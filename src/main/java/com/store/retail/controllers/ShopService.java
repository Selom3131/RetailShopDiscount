package com.store.retail.controllers;


import com.store.retail.component.Processor;
import com.store.retail.model.*;
import com.store.retail.repository.ItemRepository;
import com.store.retail.repository.ShopUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class ShopService {

    @Autowired
    ShopUserRepository shopUserRepository;
    @Autowired
    ItemRepository itemRepository;

    @PostMapping("/getNetPayableAmount")
    ResponseEntity<BillResponse> getNetPayableAmount(@RequestBody BillRequest request){

        BillResponse response = new BillResponse();

        List<Item> items =  new ArrayList();
        ShopUser user = new ShopUser();
        double discountAmount= 0;
        double totalAmount= 0;

        try{
            System.out.println(request);
            user = shopUserRepository.findById(request.getShopUserId()).get();



            if(user.getShopUserCategory() != null){

               for (ItemOrder itemOrder : request.getItemOrders()) {
                    Item item = itemRepository.findById(itemOrder.getItemId()).get();
                    if(item.getItemCategory().isBonus()){
                        discountAmount += (item.getPrice() * (user.getShopUserCategory().getDiscount()/100)) * itemOrder.getQuantity();
                    }
                   totalAmount += item.getPrice() * itemOrder.getQuantity();
                   items.add(item);
                    System.out.println(item);
                }

                response.setRequestId(request.getRequestId());
                response.setDiscountAmount(discountAmount);
               response.setFinalAmount(totalAmount - discountAmount);
               response.setTotal(totalAmount);
               response.setItems(items);
            }

        }catch (NoSuchElementException ex){

            ex.printStackTrace();

        }finally {
            System.out.println(user);
            System.out.println(discountAmount);
            System.out.println(totalAmount);
            HttpStatus statusCode = (response.getFinalAmount() > 0 ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
            ResponseEntity<BillResponse> result = new ResponseEntity<>(response, statusCode);
            return result;

        }




//        if (user)
        /*for (ItemOrder itemOrder : request.getItemOrders()) {
            Item item = itemRepository.findById(itemOrder.getItemId()).get();
            System.out.println(item);
        }


        System.out.println(shopUserRepository.findById(1));
        System.out.println(itemRepository.findById(1));*/






    }
    }
