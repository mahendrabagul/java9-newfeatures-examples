package io.github.mahendrabagul.privateinterfacemethods;

import io.github.mahendrabagul.trywithresources.MyInterface;

public class Solution implements MyInterface {
	public static void main(String[] args) {
		new Solution().normalMethod();
	}

	@Override
	public void normalMethod() {
		defaultMethod();
	}
}
