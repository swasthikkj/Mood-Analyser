package com.analyser;

public class MoodAnalysisException {
	enum ExceptionType {
		NULL, INVALID_ENTRY;
	}

	ExceptionType type;
	public MoodAnalysisException(ExceptionType type, String msg) {
		super(msg);
		this.type = type;
	}
}
