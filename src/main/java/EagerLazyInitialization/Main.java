package EagerLazyInitialization;

public class Main {

    public static void main(String[] args) {
        EagerInitialization eagerInitialization = new EagerInitialization();
        Player player = eagerInitialization.getPlayer();
        System.out.println(player);
        
        LazyInitializetion lazyInitializetion = new LazyInitializetion();
        Player player2 = lazyInitializetion.getPlayer();
        System.out.println(player2);
        
    }

}
