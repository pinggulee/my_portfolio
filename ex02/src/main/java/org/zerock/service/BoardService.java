package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService { // 비즈니스 영역
	// 게시판 글쓰기
	public void register(BoardVO board);
	// 게시판 상세페이지
	public BoardVO get(Long bno);
	// 게시판 글수정
	public boolean modify(BoardVO board);
	// 게시판 글삭제
	public boolean remove(Long bno);
	// 게시판 목록리스트
	public List<BoardVO> getList();
}
