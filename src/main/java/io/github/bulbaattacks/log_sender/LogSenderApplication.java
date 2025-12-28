package io.github.bulbaattacks.log_sender;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogSenderApplication {
	private static final Logger logger = LogManager.getLogger(LogSenderApplication.class);

	public static void main(String[] args) {
		logger.info("Приложение стартовало!");
		logger.warn("Это тестовое предупреждение.");
		logger.error("Это тестовая ошибка.");
	}
}
