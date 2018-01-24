package io.github.mahendrabagul.trywithresources;

public interface MyInterface {

	void normalMethod();

	default void defaultMethod() {
		privateMethod();
	}

	// This method is not part of the public API exposed by MyInterface
	private void privateMethod() {
		System.out.println("From private method in Interface | JAVA 9");
	}
}