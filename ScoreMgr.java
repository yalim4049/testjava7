package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr {

	// //����ó��
	// ScoreMgr-Ŭ���� �̸�
	// �迭�̸� scrArr
	// �ʿ��� ���� ������ ���ϱ�
	// 1��
	// �迭�̿� �ο� 5��
	// ���� ������
	// ������ �ַܼ� �Է¹ޱ�
	// ---git ���ε� score_step1 github ������̸� testJava6
	//
	// 2��
	// ���ѹݺ�
	// ���� �Է¿��� -1�̸� ����ó�� ����
	// ������ �Է� ����
	// (50~100) ���� ���� �ƴϸ� �ٽ��Է¹ޱ�
	// ---git ���ε� score_step2
	

	public static void main(String[] args) {

		int scrArr[] = new int[5];

		int total = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("���� 5�� �Է� : ");

		for (int i = 0; i < scrArr.length; i++) {
			
			scrArr[i] = sc.nextInt();

			total += scrArr[i];
			

		}

		

		double average = total / scrArr.length;

		System.out.println("����� " + average + "�Դϴ�.");
		System.out.println("������ " + total + "�Դϴ�.");

	}

}


