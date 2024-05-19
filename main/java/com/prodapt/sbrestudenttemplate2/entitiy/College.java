package com.prodapt.sbrestudenttemplate2.entitiy;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class College {
	private Integer id;
	private String clgname;
	private Integer stdcount;

}
