package objectiveLabs.environmentTestHarness.junit;

import org.junit.runners.model.InitializationError;

public class EnvironmentJUnitRunner extends AbstractEnvironmentJUnitRunner {

	public EnvironmentJUnitRunner(Class<?> testClass) throws InitializationError {
		super(testClass);
	}

}