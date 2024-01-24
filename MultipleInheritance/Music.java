package MultipleInheritance;

/**
 * Music
 */
interface Music {
    default void play() {
        System.out.println("Play Music");
    }
}
