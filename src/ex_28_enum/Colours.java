package ex_28_enum;

public enum Colours {

    RED("#ef2f2f"),
    GREEN("#47ef2f"),
    YELLOW("#efee2f");

   private String colour;

   Colours(String colour){
       this.colour = colour;
   }

    public String getColour() {
        return colour;
    }
}
