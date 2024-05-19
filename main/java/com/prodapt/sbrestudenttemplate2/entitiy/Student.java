package com.prodapt.sbrestudenttemplate2.entitiy;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
@Entity
@Table(name="Students_table")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer studId;
	private String name;
	private Integer age;
	private Integer collegeId;
	
}
