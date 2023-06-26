package ru.otus.testing.commandlinerunners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.otus.testing.service.TestService;


@Component
public class TestServiceRunner implements CommandLineRunner {

    private final TestService testService;

    public TestServiceRunner(TestService testService) {
        this.testService = testService;
    }

    @Override
    public void run(String... args) {
        testService.testing();
    }
}
