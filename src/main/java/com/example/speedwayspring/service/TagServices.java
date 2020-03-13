package com.example.speedwayspring.service;

import com.example.speedwayspring.domain.InventoryTag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TagServices {

    InventoryTag findTagByID(Long ID);
    InventoryTag findTagByEPC(String EPC);
    List<InventoryTag> findAllTag();


}
