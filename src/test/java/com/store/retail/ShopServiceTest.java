package com.store.retail;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.store.retail.controllers.ShopService;
import com.store.retail.model.BillRequest;
import com.store.retail.model.ItemOrder;
import com.store.retail.repository.ItemRepository;
import com.store.retail.repository.ShopUserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ShopService.class)
public class ShopServiceTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper mapper;

    @MockBean
    ShopUserRepository shopUserRepository;

    @MockBean
    ItemRepository itemRepository;

    ItemOrder itemOrder1 = new ItemOrder(1,4);
    ItemOrder itemOrder2 = new ItemOrder(4,4);
    ItemOrder itemOrder3 = new ItemOrder(2,4);
    @Test
    public void submitOrdersForTotalPaymentAmount(){

        List<ItemOrder> itemOrders = new ArrayList<>();
        itemOrders.add(itemOrder1);
        itemOrders.add(itemOrder2);
        itemOrders.add(itemOrder3);
        BillRequest billRequest = BillRequest.builder()
                .shopUserId(1)
                .requestId("Q0HDMAR345")
                .itemOrders(itemOrders)
                .build();
//        Mockito.when()

        try {
            MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/getNetPayableAmount")
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .content(this.mapper.writeValueAsString(billRequest));

            mockMvc.perform(mockRequest)
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.finalAmount",is(1050.84)));

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
