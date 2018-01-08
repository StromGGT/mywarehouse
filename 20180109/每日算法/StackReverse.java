package com.java.num3;

import java.util.Stack;

/**
 * һ��ջ����ѹ��1,2,3,4,5����ô��ջ����ջ�׷ֱ�Ϊ5,4,3,2,1�������ջת�ú�
 * ��ջ����ջ��Ϊ1,2��3,4,5��Ҳ����ʵ��ռ��Ԫ�ص����ã���ֻ���õݹ麯����ʵ�֣��������������ݽṹ��
 * @author lenovo
 *
 */

public class StackReverse {
	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result=stack.pop();
		if(stack.isEmpty()) {
			return result;
		}else {
			int last=getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		int i=getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
		
	}

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		reverse(stack);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}

	}

}
