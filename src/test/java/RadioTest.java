import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void stationsCountTest1() {

        Radio radio = new Radio(10);
        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void stationsCountTest2() {

        Radio radio = new Radio(10);
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void stationsCountTest3() {

        Radio radio = new Radio(10);
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void stationsCountTest4() {

        Radio radio = new Radio(10);
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void boundaryValueNextTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void boundaryValueTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueTest3() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueTest4() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValuePrevTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void boundaryValuePrevTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValuePrevTest3() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValuePrevTest4() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void negativeValueStationTest(){
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueStationTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueStationTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueStationTest3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueStationTest4() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueStationTest5() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void negativeValueVolumeTest(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueVolumeonTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueVolumeonTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueVolumeTest3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueVolumeTest4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void boundaryValueVolumeTest5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
