package smart.home;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;

    //Громкость

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // Радио станция

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            currentRadioStation = 0;
            return;
        }
        if (newCurrentRadioStation < 0) {
            currentRadioStation = 9;
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation--;
        }
    }

    public void next() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void changeStation(int stationNumber) {
        setCurrentRadioStation(stationNumber);
    }
}