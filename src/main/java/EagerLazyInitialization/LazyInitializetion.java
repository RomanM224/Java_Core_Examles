package EagerLazyInitialization;

public class LazyInitializetion {
    
    private Player player;
    
    public Player getPlayer()
    {
      if(player == null)
      {
        player = new Player();          // object is created when asked
      }
      return player;
    }

}
