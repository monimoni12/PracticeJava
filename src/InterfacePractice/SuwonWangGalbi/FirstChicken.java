package InterfacePractice.SuwonWangGalbi;

public interface FirstChicken {
    public int TEMP = 160;
    public void 튀기다();

    public default void building(){
        System.out.println("🏚️ 덜덜.. 무너져가는 가게...");
    }

}
