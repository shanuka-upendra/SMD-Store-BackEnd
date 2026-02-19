package com.dev.service;

import com.dev.dto.ItemDto;

import java.util.List;

public interface ItemService {
    List<ItemDto> getAllItems();
    boolean addItem(ItemDto itemDto);
}
