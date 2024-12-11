package InterfacePractice.SuwonWangGalbi;

public class TongDakk implements FirstChicken {
    @Override
    public void 튀기다() {
        System.out.println("튀긴 바삭바삭하게 맛없는 통닭!🍗");
    }

    public final void tdRecipe() {
        System.out.println("📒 형제치킨 비밀 레시피: ❓ ");
    }

    private TongDakk(){}

    public static TongDakk getInstance(){
        return new TongDakk();
    }
}
