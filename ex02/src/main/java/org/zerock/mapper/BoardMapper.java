package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {// 인터페이스

	// @Select("select * from tbl_board where bno > 0")
	// 추상메서드 ( 게시판 목록 리스트 )
	public List<BoardVO> getList();
	
	public void insert(BoardVO borad);
	
	public void insertSelectKey(BoardVO borad);
	
	public BoardVO read(Long bno);
}
