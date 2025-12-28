# log-sender

Примерное приложение на Java, демонстрирующее использование кастомного [KafkaAppender](https://github.com/bulbaattacks/KafkaAppender) для отправки логов в [Kafka](http://localhost:8082/).  
Приложение показывает, как конфигурировать логирование через `log4j2.xml` и отправлять сообщения одновременно в консоль и в Kafka‑топик.

---

## ✨ Возможности
- Отправка логов в Kafka‑топик (`logs-topic`).
- Конфигурация через `log4j2.xml` без изменения кода.
- Поддержка кастомного аппендера `KafkaAppender`.
- Демонстрация работы с консольным и Kafka‑логированием.
- Доступен Kafka UI через docker-compose.

---

## 📦 Установка

### Зависимости
В `pom.xml` приложения должны быть:
```xml
<dependency>
  <groupId>io.github.bulbaattacks</groupId>
  <artifactId>kafka-appender</artifactId>
  <version>0.0.11</version>
</dependency>

<dependency>
  <groupId>org.apache.logging.log4j</groupId>
  <artifactId>log4j-core</artifactId>
  <version>2.22.0</version>
</dependency>
<dependency>
  <groupId>org.apache.logging.log4j</groupId>
  <artifactId>log4j-api</artifactId>
  <version>2.22.0</version>
</dependency>
<dependency>
  <groupId>org.apache.kafka</groupId>
  <artifactId>kafka-clients</artifactId>
  <version>3.7.0</version>
</dependency>
