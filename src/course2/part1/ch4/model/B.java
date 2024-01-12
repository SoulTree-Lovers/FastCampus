package course2.part1.ch4.model;

public class B implements C{
    // B class는 노출되지 않는다.
    @Override
    public void x() {
        System.out.println("x() 실행");
    }

    @Override
    public void y() {
        System.out.println("y() 실행");
    }

    @Override
    public void z() {
        System.out.println("z() 실행");
    }
}
