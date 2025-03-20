package accountvmj.account;

import accountvmj.account.core.Account;
import java.lang.reflect.Constructor;
import java.util.logging.Logger;

public class AccountFactory {
    private static final Logger LOGGER = Logger.getLogger(AccountFactory.class.getName());

    public AccountFactory() { /* this constructor is empty */ }

    public static Account createAccount(String fullyQualifiedName, Object ... base) {
    	Account record = null;

		try
		{
			Class<?> clz = Class.forName(fullyQualifiedName);
			Constructor<?> constructor = clz.getDeclaredConstructors()[0];
			record = (Account) constructor.newInstance(base);
		}
		catch (IllegalArgumentException e)
		{
			handleException(fullyQualifiedName, "Failed to run: Check your constructor argument", 20);
		}
		catch (ClassCastException e)
		{
			handleException(fullyQualifiedName, "Failed to cast the object", 30);
		}
		catch (ClassNotFoundException e)
		{
			handleException(fullyQualifiedName, "Decorator can't be applied to the object", 40);
		}
		catch (Exception e)
		{
			handleException(fullyQualifiedName, "Unknown exception.", 50);
		}

		LOGGER.info("AccountFactory: Class created: " + fullyQualifiedName);
    	return record;
    }

	private static void handleException(String fullyQualifiedName, String errorMessage, int statusCode) {
		LOGGER.severe("Failed to create instance of Account.");
		LOGGER.severe("Given FQN: " + fullyQualifiedName);
		LOGGER.severe(errorMessage);
		System.exit(statusCode);
	}

}
