package com.LabDemo.inventoryservice.controller;

import com.LabDemo.inventoryservice.model.Inventory;
import com.LabDemo.inventoryservice.repository.InventoryRepository;
import com.LabDemo.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
//@RequiredArgsConstructor
public class InventoryController {

  // private final InventoryService inventoryService;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("sku-code") String skuCode){
        //InventoryController inventoryService = new InventoryController();
        return true;

    }

}
