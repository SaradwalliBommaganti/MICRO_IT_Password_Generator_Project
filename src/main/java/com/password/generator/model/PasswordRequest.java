package com.password.generator.model;

public class PasswordRequest {
    private int length;
    private boolean useUppercase;
    private boolean useLowercase;
    private boolean useDigits;
    private boolean useSymbols;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean isUseUppercase() {
		return useUppercase;
	}
	public void setUseUppercase(boolean useUppercase) {
		this.useUppercase = useUppercase;
	}
	public boolean isUseLowercase() {
		return useLowercase;
	}
	public void setUseLowercase(boolean useLowercase) {
		this.useLowercase = useLowercase;
	}
	public boolean isUseDigits() {
		return useDigits;
	}
	public void setUseDigits(boolean useDigits) {
		this.useDigits = useDigits;
	}
	public boolean isUseSymbols() {
		return useSymbols;
	}
	public void setUseSymbols(boolean useSymbols) {
		this.useSymbols = useSymbols;
	}

    // Getters and setters
}
