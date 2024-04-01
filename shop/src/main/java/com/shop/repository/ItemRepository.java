package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Long> {
    List<Item> findByItemNm(String itemNm);
    List<Item> findByItemNmOrItemDetail(String imemNm, String itemDetail);
}
