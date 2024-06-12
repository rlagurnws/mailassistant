package com.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ResponseDTO {

	private int mail_id;
	private int sender;
	private int receiver;
	private String subject;
	private String content;
	private String time;
	private String email;
	private String senderName;
	private String receiverName;
}
