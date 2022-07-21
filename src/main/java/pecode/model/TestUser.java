package pecode.model;

import aquality.selenium.core.utilities.JsonSettingsFile;

public class TestUser {

    private String userName;
    private String password;

    public TestUser(JsonSettingsFile jsonSettingsFile) {
        userName = jsonSettingsFile.getValue("/user_name").toString();
        password = jsonSettingsFile.getValue("/password").toString();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
