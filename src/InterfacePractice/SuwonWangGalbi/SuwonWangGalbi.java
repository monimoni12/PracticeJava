package InterfacePractice.SuwonWangGalbi;

/*
수원왕갈비 가게
왕갈비 장사하면서 여러 버전이 나올 수 있기 때문에 인터페이스로 구현

[BrotherChicken 인터페이스] 상속
- 튀기다()
- default 메소드 building()
- implement한 객체에서 바로 TEMP 사용 가능

[양념 인터페이스] 상속
- 양념()
 */
public interface SuwonWangGalbi extends BrotherChicken, 양념 {
    // 인터페이스 내 상수
    public String SECRET = "👮🏻 난 사실 경찰!";

    // 인터페이스 내 static 메서드: "리모콘의 후레쉬"
    public static void greeting() {
        System.out.println("📞 지금까지 이런 맛은 없었다. 이것은 갈비인가 통닭인가. 예~ 수원왕갈비통닭입니다.");
    }

    // 후레쉬2
    public static void greeting2() {
        System.out.println("🍴 맛있게 드세요~");
    }

    // 장사 처음 할 땐 건물 세워야 함
    default void building() {
        System.out.println("🏗️ 수원왕갈비통닭 건물 짓는 중...");
    }
}
