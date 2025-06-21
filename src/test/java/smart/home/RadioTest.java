package smart.home;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RadioTest {
    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio(20);

        radio.setCurrentVolume(15);

        int expected = 15;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetVolumeBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-20);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolume(130);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWithLimits1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWithLimits2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //
    @Test
    public void shouldSetStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.next();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

}