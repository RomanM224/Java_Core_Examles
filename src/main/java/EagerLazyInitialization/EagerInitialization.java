package EagerLazyInitialization;

public class EagerInitialization {

    private Player player = new Player();         // object is created well in advance
    
    public Player getPlayer()
    {
      return player;
    }
}
