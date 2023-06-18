package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio () {
        this.maxStation = 9;
    }
    public Radio (int stationCount) {
        this.maxStation = stationCount - 1;

    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else currentVolume = 100;
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else currentVolume = 0;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}

