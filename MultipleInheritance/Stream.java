package MultipleInheritance;

class Stream implements Music, Video {
    @Override
    public void play() {
        Music.super.play();
        Video.super.play();
    }

    public void playMusic() {
        Music.super.play();
    }

    public void playVideo() {
        Video.super.play();
    }

    public static void main(String args[]) {
        Stream s = new Stream();
        s.play();
        s.playMusic();
        s.playVideo();
    }
}