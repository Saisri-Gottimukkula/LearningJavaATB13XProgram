package ex_28_enum;

public class Lab002_enum_locators {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password.getLocators());
        System.out.println(Locators.page_button.getLocators());


        System.out.println(Colours.GREEN.getColour());
        System.out.println(Colours.RED.getColour());


        System.out.println(URL.FIREFOX.getUrl());
    }
}
