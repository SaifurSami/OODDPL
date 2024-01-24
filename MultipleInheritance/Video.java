package MultipleInheritance;

/**
 * Video
 */
interface Video {
    default void play() {
        System.out.println("Play Video");
    }
}
