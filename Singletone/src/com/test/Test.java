package com.test;

import com.util.DBUtil;

public class Test {

	public static void main(String[] args) {
		System.out.println("connection1--------->"+DBUtil.getConnection());
		System.out.println("connection2------->"+DBUtil.getConnection());
		System.out.println("connection1--------->"+DBUtil.getConnection());
		System.out.println("connection2------->"+DBUtil.getConnection());
		System.out.println("connection1--------->"+DBUtil.getConnection());
		System.out.println("connection2------->"+DBUtil.getConnection());

	}

}
