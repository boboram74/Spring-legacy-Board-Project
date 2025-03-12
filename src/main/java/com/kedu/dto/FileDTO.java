package com.kedu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class FileDTO {
	
	private int id;
	private String oriName;
	private String sysName;
	private int parent_seq;
	
}