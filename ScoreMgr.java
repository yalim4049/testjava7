package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr {

	// //성적처리
	// ScoreMgr-클래스 이름
	// 배열이름 scrArr
	// 필요한 변수 스스로 정하기
	// 1차
	// 배열이용 인원 5명
	// 총점 평균출력
	// 점수를 콘솔로 입력받기
	// ---git 업로드 score_step1 github 저장소이름 testJava6
	//
	// 2차
	// 무한반복
	// 성적 입력에서 -1이면 성적처리 종료
	// 점수의 입력 제한
	// (50~100) 사이 값이 아니면 다시입력받기
	// ---git 업로드 score_step2
	

	public static void main(String[] args) {

		int scrArr[] = new int[5];

		int total = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("점수 5개 입력 : ");

		for (int i = 0; i < scrArr.length; i++) {
			
			scrArr[i] = sc.nextInt();

			total += scrArr[i];
			

		}

		

		double average = total / scrArr.length;

		System.out.println("평균은 " + average + "입니다.");
		System.out.println("총점은 " + total + "입니다.");

	}

}


