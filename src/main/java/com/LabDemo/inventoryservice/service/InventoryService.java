package com.LabDemo.inventoryservice.service;
import com.LabDemo.inventoryservice.model.Inventory;
import com.LabDemo.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

//@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }


    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode){
        //assert inventoryRepository != null;
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }


}
