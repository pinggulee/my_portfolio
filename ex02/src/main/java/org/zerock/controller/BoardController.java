package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/board")
public class BoardController {
	
	private BoardService service;
	
	// 게시판 목록
	//@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	@GetMapping("list")
	public void list(Model model) {
		log.info("list");
		//					배열이름, select된 결과물
		model.addAttribute("list",service.getList());
	}
	
	@GetMapping("read")
	public void read(long bno,Model model) {
		log.info("read="+ bno);
		model.addAttribute("read",service.get(bno));
	}
	
	// 글쓰기 화면으로 이동하기 위해
	@GetMapping("register")
	public void register() {
		log.info("register");
	}
	
	// 글쓰기 화면에서 글쓰기 버튼을 클릭했을 때 제목, 내용, 작성자를 처리하기 위해
	@PostMapping("register")
	public String registerpost(BoardVO board, RedirectAttributes rttr) {
		log.info("insert 하기전 " + board);
		service.register(board);
		rttr.addAttribute("bno", board.getBno());
		return "redirect:/board/read";
	}
	
	// 글수정 화면으로 이동하기 위해
	@GetMapping("modify")
	public void modifyGet(long bno,Model model){
		log.info("modify");
		model.addAttribute("modify",service.get(bno));
	}
	
	// 글수정 화면에서 글수정 버튼을 클릭했을 때 제목, 내용을 처리하기 위해
	@PostMapping("modify")
	public String modifyPost(BoardVO board, RedirectAttributes rttr){
		log.info("modifyPost=" + board);
		service.modify(board);
		rttr.addAttribute("bno", board.getBno());
		return "redirect:/board/read";
	}
	
	@GetMapping("remove")
	public String remove(long bno){
		log.info("remove=" + bno);
		service.remove(bno);
		return "redirect:/board/list";
	}
}
