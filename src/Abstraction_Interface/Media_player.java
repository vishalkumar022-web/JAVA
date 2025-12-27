package Abstraction_Interface;

public abstract class Media_player {
    String fileName ;
    void play(){

    }
}
class AudioPlayer extends Media_player{
    int name;
    AudioPlayer(String name ){
        this.fileName = name ;
    }

    @Override
    void play() {
        System.out.println("Playing Audio :"+fileName+"song.mp3");
    }
}

class VedioPlayer extends Media_player{
    int name;
    VedioPlayer(String name ){
        this.fileName = name ;
    }

    @Override
    void play() {
        System.out.println("Playing vedio :"+fileName+"movie.mp4");
    }

    public static void main(String[] args) {
        AudioPlayer obj= new AudioPlayer("All is well ");
        VedioPlayer obj1 = new VedioPlayer("SHolee ");

        obj.play();
        obj1.play();
    }
}