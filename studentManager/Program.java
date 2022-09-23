package studentManager;

import java.util.Scanner;

public interface Program {
	/*
	program interface
	학생 리스트
	학생 등록
	학생 검색
	수강 신청
	수강 철회
	*/
	
	void printStudent();
	void insertStudent(Scanner scan);
	void searchStudent(Scanner scan);
	void registerSubject(Scanner scan);
	void deleteSubject(Scanner scan);
	
}
