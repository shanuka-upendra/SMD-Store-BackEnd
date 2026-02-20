package com.dev.Controller;

import com.dev.dto.ItemDto;
import com.dev.service.ItemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
@CrossOrigin
@Tag(name = "Item-Controller" , description = "Item API Collection")
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/search-all")
    public List<ItemDto> getAllItems(){
        return itemService.getAllItems();
    }

    @PostMapping("/add-item")
    public boolean addItem(@RequestBody ItemDto itemDto){
        return itemService.addItem(itemDto);
    }

    @PutMapping("/update-item")
    public boolean updateItem(@RequestBody ItemDto itemDto){
        return itemService.updateItem(itemDto);
    }

    @DeleteMapping("/delete-item/{id}")
    public boolean deleteItem(@PathVariable String id){
        return itemService.deleteItem(id);
    }
}
