package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {// �������̽�

	// @Select("select * from tbl_board where bno > 0")
	// �߻�޼��� ( �Խ��� ��� ����Ʈ )
	public List<BoardVO> getList(); // 리턴할 떄 리스트로 변환 후 리턴(arraylist)
	// �߻�޼��� - pk���� �� �ʿ䰡 ���� ��� (�ܼ� �Խñ۾���)
	public void insert(BoardVO borad); 
	// �߻�޼��� - pk���� �˾ƾ� �ϴ� ��� �Խñ۾��� + ÷������)
	public void insertSelectKey(BoardVO borad); 
	// �߻�޼��� - �Խ��� ��� ����Ʈ���� ������ Ŭ���� �� ������ �������� ��ȸ
	public BoardVO read(Long bno); // 배열에다가 저장할 필요가 없음
	// �߻�޼��� (�Խ��� �ۻ���)
	public int delete(Long bno);
	// �߻�޼��� (�Խ��� �ۼ���)
	public int update(BoardVO board);
}
