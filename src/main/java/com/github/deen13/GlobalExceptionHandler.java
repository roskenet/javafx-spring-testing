package com.github.deen13;

import org.controlsfx.control.Notifications;

public class GlobalExceptionHandler implements Thread.UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread thread, Throwable throwable) {
		Notifications.create()
				.title("Error")
				.text(throwable.getMessage())
				.showError();
	}

}
