package com.r.method_related_rule;

class Super{
	public void show() {
		System.out.println("Super class method not throwing checked exception");
	}
}
class sub extends Super{
	@Override
	public void show() {
		System.out.println("Sub class method should not throw checked exception");
	}
}
public class MethodOverridingWithChecked {
	public static void main(String[] args) {
		
	}

}
