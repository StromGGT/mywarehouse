package com.java.find;

/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�n<=39
 * @author lenovo
 *
 */

public class Fibocnacci {
	 public static int Fibonacci(int n) {
	        int result=0;
	        int i=1;
	        int j=1;
	         if(n<0){
	            return 0;
	        }else if(n==1||n==2){
	            return 1;
	         }else{
	              for(int k=3;k<=n;k++){
	            result=i+j;
	            i=j;
	            j=result;
	        }
	         }
	       
	        return result;

	    }
	public static void main(String[] args) {
		System.out.println(Fibonacci(10));
	}

}
