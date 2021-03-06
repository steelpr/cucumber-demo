package projections.register.service;

import java.util.ArrayList;
import java.util.List;

import projections.models.User;

public class RegisterService {
	private static List<User> usersDB = new ArrayList<>();

	public static String register(String username, String firstPassword, String secondPassword) {

		intDb();

		if (null == firstPassword || firstPassword.isBlank()) {
			return "Въведете парола!";
		}

		if (!firstPassword.equals(secondPassword)) {
			return "Въведете еднакви пароли!";
		}

		if (username == null || username.isBlank()) {
			return "Въведете име!";
		}

		boolean isUsernameExists = usersDB.stream().anyMatch(u -> u.getUsername().equals(username));
		if (isUsernameExists) {
			return "Потребителското име е заето!";
		}

		final User newUser = new User(username, firstPassword);
		usersDB.add(newUser);
		return "Успешна регистрация!";
	}

	private static void intDb() {
		usersDB.clear();
		usersDB.add(new User("Пешо", "Пешо"));
	}

}
