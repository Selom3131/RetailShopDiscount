package com.store.retail.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Entity
@Table(name = "shop_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    int id;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "address")
    String address;
    @Column(name="created_at")
    private Date createdAt;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cat_id")
    ShopUserCategory shopUserCategory;


    public long getNumberOfMonths(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.createdAt);
        Calendar today = new GregorianCalendar();

        LocalDate  creationDate = this.createdAt.toLocalDate();

        LocalDate localDate = LocalDate.now();

        Period period = creationDate.until(localDate);


        return ChronoUnit.MONTHS.between(creationDate,localDate);
    }



}
