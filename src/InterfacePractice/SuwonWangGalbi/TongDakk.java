package InterfacePractice.SuwonWangGalbi;

// 형제치킨에서 만들던 치킨.
public class TongDakk implements BrotherChicken {
    // 통닭 튀기는 방식.
    @Override
    public void 튀기다() {
        System.out.println("튀긴 바삭바삭하게 맛없는 통닭!🍗");
    }

    // 레시피는 바뀌지 않음: final 메소드
    public final void tdRecipe() {
        System.out.println("📒 형제치킨 비밀 레시피: ❓ ");
    }


    // 수원왕갈비통닭에서 처음 한번만 만들고 말 것임: 인스턴스 하나

    // private 생성자: 외부에서 객체 생성을 차단
    private TongDakk(){}
    // getInstance()를 통해서만 객체 생성/반환
    public static TongDakk getInstance(){
        return new TongDakk();
    }
}
