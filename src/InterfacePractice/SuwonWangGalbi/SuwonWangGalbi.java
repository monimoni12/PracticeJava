package InterfacePractice.SuwonWangGalbi;

public interface SuwonWangGalbi extends FirstChicken, 양념 {
    public String SECRET = "👮🏻 난 사실 경찰!";

    public static void greeting() {
        System.out.println("📞 지금까지 이런 맛은 없었다. 이것은 갈비인가 통닭인가. 예~ 수원왕갈비통닭입니다.");
    }

    public static void greeting2() {
        System.out.println("🍴 맛있게 드세요~");
    }

    default void building() {
        System.out.println("🏗️ 수원왕갈비통닭 건물 짓는 중...");
    }
}
