package org.zerock.domain;

import java.util.Date; // date 정보를 가져오기 위해 사용

import lombok.Data;

@Data
public class BoardVO {

	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
}
