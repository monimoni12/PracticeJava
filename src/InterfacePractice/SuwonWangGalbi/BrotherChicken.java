package InterfacePractice.SuwonWangGalbi;

/*
수원왕갈비 전신인 형제 치킨 가게.

- `튀기다()` 메소드 : 클래스에서 사용시 강제 구현하도록
치킨마다 다양한 튀김방식

- 인터페이스 내 상수 TEMP: 치킨 튀김 적정 온도

- `building()` 메소드 : default- 필요한 클래스만 사용하도록
가게 건물 상태

*/

public interface BrotherChicken {
    public int TEMP = 160;
    public void 튀기다();

    public default void building(){
        System.out.println("🏚️ 덜덜.. 무너져가는 가게...");
    }

}
