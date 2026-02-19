package com.dev.repository.impl;

import com.dev.dto.ItemDto;
import com.dev.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ItemRepositoryImpl implements ItemRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<ItemDto> getAllItems() {
        String sql = "SELECT * FROM item";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemCode(rs.getString(1));
            itemDto.setDescription(rs.getString(2));
            itemDto.setPackSize(rs.getString(3));
            itemDto.setPrice(rs.getDouble(4));
            itemDto.setQty(rs.getInt(5));
            return itemDto;
        });
    }

    @Override
    public boolean addItems(ItemDto itemDto) {
        String sql = "INSERT INTO item VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                itemDto.getItemCode(),
                itemDto.getDescription(),
                itemDto.getPackSize(),
                itemDto.getPrice(),
                itemDto.getQty()) > 0;
    }
}
