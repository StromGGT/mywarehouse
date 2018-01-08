package com.java.find;

/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
 * ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� 
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * 
 * ���ֲ���
 * @author lenovo
 *
 */

public class BinarySearch {
	public static int minNumberInRotateArray(int[] array) {
		if(array.length==0)	return 0;
		int left=0;
		int right=array.length-1;
		int mid=-1;
		while(array[left]>=array[right]) {
			if(right-left==1) {
				mid=right;
				break;
			}
			mid=left+(right-left)/2;
			
			//������Ϊ{1,1,0,1,1,1,1}ʱ��ֻ��ͨ��ѭ������
			if(array[left]==array[right]&&array[mid]==array[left]) {
				return MinInOrder(array,left,right);
			}
			if(array[mid]>=array[left]) {
				left=mid;
			}
			if(array[mid]<array[left]) {
				right=mid;
			}
		}
		return array[mid];
	}
	public  static int MinInOrder(int[] array,int left, int right) {
		int result=array[left];
		for(int i=left+1; i<=right; i++) {
			if(result>array[i]) {
				result=array[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array= {1,0,1,1,1};
		System.out.println(minNumberInRotateArray(array));

	}

}
