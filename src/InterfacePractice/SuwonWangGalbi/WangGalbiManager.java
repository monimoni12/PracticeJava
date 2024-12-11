/*
- final 메소드 쓰기

- 인터페이스 안에 상수값 쓰기(final static 생략해도 되는 거 확인) / 대문자로 쓰는 게 관례

- final 상수값을 생성자 말고 main에서 설정해주는 게 가능한지 확인하기 🙅🏻‍♀️
↳ 인터페이스의 final 상수는 [선언 시 초기화]해야 하며, main에서 초기화할 수 없음.
↳ 동적으로 값을 설정하려면 인터페이스가 아닌 [클래스를 사용해야] 함

- 인터페이스 안에 default 메소드(새로 생길 객체들을 위한 메소드로), static 메소드 구현하기

- 인터페이스 객체생성 안 되지만 타입으로 사용하기

- getInstance() 메소드? (Son - SonTest)

 */
package InterfacePractice.SuwonWangGalbi;

public class WangGalbiManager implements SuwonWangGalbi {
    @Override
    public void 튀기다() {
        System.out.print("바삭바삭 갓 튀긴 ");
    }

    @Override
    public void 양념() {
        System.out.println("crazy갈비 나왔습니다~");
    }

    public static void main(String[] args) {
        // TongDakk tdakk = new TongDakk();
        TongDakk tdakk = TongDakk.getInstance();
        tdakk.building();
        tdakk.tdRecipe();
        System.out.print(TEMP +"℃에 ");
        tdakk.튀기다();

        SuwonWangGalbi galbi = new WangGalbiManager();
        galbi.building();

        SuwonWangGalbi.greeting();

        System.out.print("😋 ");
        galbi.튀기다();
        galbi.양념();

        SuwonWangGalbi.greeting2();


        System.out.println(galbi.SECRET);
    }
}
