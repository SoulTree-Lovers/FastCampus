package course1.part4.ch5.model;

public class Radio implements RemoCon {
    // chUp(), chDown(), volUp(), volDown() 메소드 구현

    @Override
    public void chUp() {
        System.out.println("Radio chUp()");
    }

    @Override
    public void chDown() {
        System.out.println("Radio chDown()");
    }

    @Override
    public void volUp() {
        System.out.println("Radio volUp()");
    }

    @Override
    public void volDown() {
        System.out.println("Radio volDown");
    }
}
