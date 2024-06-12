package com.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DocumentObject {

	private String title;
	private String content;
}
