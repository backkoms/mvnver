package cn.test.core;

import cn.test.core.host.Wareing;

public class APIController {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		Wareing iWareing = new WareingImpl();
		iWareing.sign();
	}
}
