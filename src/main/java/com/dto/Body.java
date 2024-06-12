package com.dto;

import com.Entity.Content;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Body {

	private DocumentObject document;
	private OptionObject option;
}
