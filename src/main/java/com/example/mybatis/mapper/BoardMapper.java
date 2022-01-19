package com.example.mybatis.mapper;

import com.example.mybatis.model.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
	List<Board> findBoard();
}
