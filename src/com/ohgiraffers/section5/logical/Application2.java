package com.ohgiraffers.section5.logical;

public class Application2 {
    public static void main(String[] args) {
        /* 논리 연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다. */

        /* 1. 1부터 100사이의 값인지 확인 */
        int num1 = 55;
        System.out.println("1부터 100사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        /* 2. 영어 대문자인지 확인 */
        char ch1 = 'g';
        System.out.println("영어 대문자인지 확인 : "+ (ch1 >= 'A' && ch1 <= 'Z'));

        /* 3. 대소문자 상관 없이 영문자 y인지 확인 */
        char ch2 ='a';
        System.out.println("영문자 y인지 확인 : " + (ch2 == 'Y' || ch2 =='y'));

        /* 4. 영문자인지 확인 (대문자 또는 소문자)
        * && 는 || 보다 우선순위가 높다.
        * 괄호로 묶지 않아도 올바르게 연산 되지만 논리적으로 먼저 실행 되는 내용을 괄호로 묶어주면 코드를 읽을 때 파악하기 쉽다. */
        char ch3 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch3 >= 'A' && ch3 <= 'Z') || (ch3 >='a' && ch3 <= 'z')));


    }
}
