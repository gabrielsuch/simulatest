package org.simulatest.environment.test.testdouble;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.simulatest.environment.junit.EnvironmentJUnitSuite;

@RunWith(EnvironmentJUnitSuite.class)
@SuiteClasses({ DummyTest.class, AnotherDummyTest.class })
public class SuiteTest {

}
