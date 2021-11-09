package com.store.retail.repository;

import com.store.retail.model.ShopUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopUserRepository extends CrudRepository<ShopUser,Integer> {
}
