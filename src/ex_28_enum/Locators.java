package ex_28_enum;

public enum Locators {

    page_input_email("#login_username"),
    page_input_password("#login_password"),
    page_button("button");

    private String locators;

    Locators(String locators){
        this.locators = locators;
    }

    public String getLocators() {
        return locators;
    }
}
