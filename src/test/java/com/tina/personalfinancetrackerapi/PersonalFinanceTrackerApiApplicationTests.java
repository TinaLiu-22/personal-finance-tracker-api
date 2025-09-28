package com.tina.personalfinancetrackerapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class PersonalFinanceTrackerApiApplicationTests {

    @Test
    void createApplicationModuleModel() {
        ApplicationModules modules = ApplicationModules.of(PersonalFinanceTrackerApiApplication.class);
        modules.forEach(System.out::println);
    }

    @Test
    void verifiesModularStructure() {
        ApplicationModules modules = ApplicationModules.of(PersonalFinanceTrackerApiApplication.class);
        modules.verify();
    }

    @Test
    void createModuleDocumentation() {
        ApplicationModules modules = ApplicationModules.of(PersonalFinanceTrackerApiApplication.class);
        new Documenter(modules)
                .writeDocumentation()
                .writeIndividualModulesAsPlantUml();
    }

}
