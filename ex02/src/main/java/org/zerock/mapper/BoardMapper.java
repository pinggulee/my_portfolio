package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {// �������̽�

	// @Select("select * from tbl_board where bno > 0")
	// �߻�޼��� ( �Խ��� ��� ����Ʈ )
	public List<BoardVO> getList();
	
	public void insert(BoardVO borad);
	
	public void insertSelectKey(BoardVO borad);
	
	public BoardVO read(Long bno);
}
