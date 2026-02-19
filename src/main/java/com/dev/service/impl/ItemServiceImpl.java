package com.dev.service.impl;

import com.dev.dto.ItemDto;
import com.dev.repository.ItemRepository;
import com.dev.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public List<ItemDto> getAllItems() {
        return itemRepository.getAllItems();
    }

    @Override
    public boolean addItem(ItemDto itemDto) {
        return itemRepository.addItems(itemDto);
    }
}
