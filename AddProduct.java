package chapter1;

import java.util.Scanner;

/*
 * 新增商品
 */
public class AddProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入添加的商品数量:");
		int count = sc.nextInt();  //键盘输入
		System.out.println("新增的商品如下：");
		for (int i = 1; i <= count; i++) {       
			System.out.println("商品"+i); // 打印输出商品			
		}		
	}
}
