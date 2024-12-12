package InterfacePractice.SuwonWangGalbi;

public class WangGalbiManager implements SuwonWangGalbi {
    // 수원왕갈비통닭 튀기는 방식.
    @Override
    public void 튀기다() {
        System.out.print("바삭바삭 갓 튀긴 ");
    }

    // 수원왕갈비통닭 양념
    @Override
    public void 양념() {
        System.out.println("crazy갈비 나왔습니다~");
    }

    public static void main(String[] args) {
        // getInstance() @ TongDakk 클래스 - 이전 버전은 한번만 만들어도 충분.
        // TongDakk tdakk = new TongDakk();
        TongDakk tdakk = TongDakk.getInstance();
        tdakk.building();
        tdakk.tdRecipe();
        System.out.print(TEMP +"℃에 ");
        tdakk.튀기다();
        // 형제치킨은 도저히 맛이 없고 가게도 무너져가네..

        // 수원왕갈비통닭 등장!
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
