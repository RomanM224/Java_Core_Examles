package Enum;

public class EnumTest {

    public static void main(String[] args) {
        System.out.println(Style.ROMANTICISM);
        
        System.out.println(Style.ROMANTICISM.style);
        
        Style style = Style.POST_IMPRESSIONISM;
        System.out.println(style);
        
        Style style2 = Style.valueOf("CUBISM");
        System.out.println(style2.style);
        
        Style[] styles = Style.values();
        for(Style myStyle : styles) {
            System.out.println(myStyle);
        }

    }
    
enum Style {
  
  ROMANTICISM("Romanticism"), CUBISM("Cubism"), POST_IMPRESSIONISM("Post-Impressionism"), SELF_PORTRAIT("Self portrait"), RENAISSANE("Renaissance"),
  HIGH_RENAISSANCE("High Renaissance");
  
  private String style;
  
  private Style(String style) {
      this.style = style;
  }
}
}
