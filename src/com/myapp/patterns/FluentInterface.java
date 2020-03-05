package com.myapp.patterns;

public class FluentInterface {

	public FluentInterface m1() {
		return this;
	}

	public FluentInterface m2() {
		return this;
	}

	public FluentInterface m3() {
		return this;
	}

	public static void main(String[] args) {
		FluentInterface obj = new FluentInterface();
		obj.m1().m2().m3();
	}
}
