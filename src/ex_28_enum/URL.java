package ex_28_enum;

public enum URL {

    GOOGLE("https://www.google.com/"),
    FIREFOX("https://www.firefox.com/");

    private String url;

     URL(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
