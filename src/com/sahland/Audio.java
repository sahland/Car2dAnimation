package com.sahland;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Audio {
    private String track; //адресс трека(файл)
    private Clip clip = null; //ссылка на объект класса
    private FloatControl volumeC = null; //контроллер кромкости
    private double wt; //уровень громкости

    public Audio(String track, double wt){
        this.track = track;
        this.wt = wt;
    }

    public void sound(){
        File f = new File(this.track);//передача звукового файла в f
        //поток для записи и считывания
        AudioInputStream tr = null; // объект потока AudioInputStream пуст
        try {
            tr = AudioSystem.getAudioInputStream(f); //получаем AudioInputStream(нужный файл)
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            clip = AudioSystem.getClip(); //получаем реализация интерфейса clip
            clip.open(tr); // загружаю звуковой поток в clip
            //получаю контроллер громкости
            volumeC = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

            clip.setFramePosition(0);
            clip.start();

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setVolume() {
        if(wt < 0){
            wt = 0;
        }
        if(wt > 1){
            wt = 1;
        }
        float min = volumeC.getMinimum();
        float max = volumeC.getMaximum();
        volumeC.setValue((max-min)*(float)wt+min);
    }
}
