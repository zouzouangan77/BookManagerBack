package com.samuelangan.mycompagny;

import com.samuelangan.mycompagny.config.AsyncSyncConfiguration;
import com.samuelangan.mycompagny.config.EmbeddedKafka;
import com.samuelangan.mycompagny.config.EmbeddedMongo;
import com.samuelangan.mycompagny.config.EmbeddedRedis;
import com.samuelangan.mycompagny.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { BookmanagerbackApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedMongo
@EmbeddedKafka
public @interface IntegrationTest {
}
