package ru.netology;

public class Radio {
flexibl
    private int currentRadio;
    private int currentVolume;
    private int minRadio = 0;
    private int maxRadio = 9;
    private int defaultRadio = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int defaultRadio) {
        this.defaultRadio = defaultRadio;
    

    private int currentRadio;
    private int currentVolume;
master


    public int getCurrentRadio() {
        return currentRadio;
    }

flexible
    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < minRadio) {
            return;
        }
        if (currentRadio > maxRadio) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public void nextStation() {
        int nextStation = currentRadio + 1;
        if (nextStation > maxRadio) {
            currentRadio = minRadio;

        }
    }

    public void beforeStation() {
        int beforeStation = currentRadio - 1;
        if (beforeStation < minRadio) {
            currentRadio = maxRadio;

        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextVolume() {
        int nextVolume = currentVolume + 1;
        if (nextVolume > maxVolume) {
            currentVolume = maxVolume;

        }
    }

    public void beforeVolume() {
        int beforeVolume = currentVolume - 1;
        if (beforeVolume < minVolume) {
            currentVolume = minVolume;

        }
    }
}


    public void setCurrentRadio(int newCurrentRadio) {
        int minRadio = 0;
        int maxRadio = 9;

        if (newCurrentRadio < minRadio) {
            return;
        }
        if (newCurrentRadio > maxRadio) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void nextStationRadio() {
        int nextStationRadio = currentRadio + 1;
        int minRadio = 0;
        int maxRadio = 9;

        if (nextStationRadio > maxRadio) {
            currentRadio = minRadio;
        }
    }

    public void beforeStationRadio() {
        int beforeStationRadio = currentRadio - 1;
        int minRadio = 0;
        int maxRadio = 9;

        if (beforeStationRadio < minRadio) {
            currentRadio = maxRadio;
        }
    }

    public void setCurrentVolume(int newVolume) {
        int minVolume = 0;
        int maxVolume = 10;
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;

    }

    public void nextVolume() {
        int maxVolume = 10;
        int nextVolume = currentVolume + 1;
        int v = currentVolume + 1;

        if (v > maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = nextVolume - 1;
        }

    }

    public void beforeVolume() {
        int minVolume = 0;
        int beforeVolume = currentVolume - 1;
        int v = currentVolume - 1;
        if (v < minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = beforeVolume + 1;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


}


master
