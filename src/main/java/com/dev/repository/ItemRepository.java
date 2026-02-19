package com.dev.repository;

import com.dev.dto.ItemDto;

import java.util.List;

public interface ItemRepository {
    List<ItemDto> getAllItems();
    boolean addItems(ItemDto itemDto);
}
