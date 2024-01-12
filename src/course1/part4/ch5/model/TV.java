package course1.part4.ch5.model;

public class TV implements RemoCon {
    // chUp(), chDown(), volUp(), volDown() 메소드 구현

    @Override
    public void chUp() {
        System.out.println("TV chUP()");
    }

    @Override
    public void chDown() {
        System.out.println("TV chDown()");
    }

    @Override
    public void volUp() {
        System.out.println("TV volUP()");
    }

    @Override
    public void volDown() {
        System.out.println("TV volDown()");
    }
}
