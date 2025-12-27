package Abstraction_Interface;

import java.net.MulticastSocket;

public interface Music_Player {

    void playSong(String name);

    void Pause();
}

class spotify implements Music_Player{
   public void playSong(String name){
        System.out.println("This "+name+" Song is Playing on Spotify ");
    }
    public void Pause(){
        System.out.println(" Music gets pause!! ");
    }
}


class localPlayer implements Music_Player{
    @Override
    public void playSong(String name) {
        System.out.println("This "+name+" Song is Playing on Local music_player ");
    }
    public void Pause(){
        System.out.println(" Music gets pause!! ");
    }

    public static void main(String[] args) {
        Music_Player obj = new localPlayer();
        Music_Player obj1 = new spotify();

        obj.playSong("All is Well ");
        obj.Pause();
        obj1.playSong("Bhojpuri ");
        obj1.Pause();
    }
}

