import java.util.ArrayList;
import java.util.Scanner;

public class Product extends Menu {
    int menuPrice;

    public Product(String menuName, String menuDesc, int menuPrice) {
        super(menuName, menuDesc);
        this.menuPrice = menuPrice;
    }
    public Product() {
    }
    Scanner sc = new Scanner(System.in);
    Order order = new Order();

    // 출력 시 주소값 문자열로 전환
    @Override
    public String toString() {
        return menuName + menuDesc + menuPrice;
    }

    // 상품들만 묶고 메뉴출력과 주문 클래스에서 사용
    public void burger() {
        ArrayList<Product> burgers = new ArrayList<>();
        burgers.add(new Product("맥스파이시상하이버거", "겉은 바삭, 속은 부드러운 치킨 패티의 매콤함으로 화끈하게!", 5200));
        burgers.add(new Product("베이컨토마토디럭스", "더욱 풍부하고 신선한 맛의 프리미엄 버거", 5800));
        burgers.add(new Product("불고기버거", "한국인의 입맛에 딱 맞는 불고기 소스와 버거의 맛있는 조합", 2300));
        burgers.add(new Product("슈슈버거", "탱~글한 통새우살 가득~", 4700));
        burgers.add(new Product("슈비버거", "탱~글한 통새우살에 비프 패티를 더해 푸짐하게~", 5800));
        burgers.add(new Product("빅맥", "순 쇠고기 패티 두 장에 특별한 소스, 양상추, 치즈, 피클, 양파까지", 5200));

        System.out.println("\"McDonald's 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품 메뉴판을 보시고 상품을 골라 입력해 주세요.\n");
        System.out.println("[ Burgers MENU ]");
        int n = 1;
        for (Product item : burgers) {
            System.out.printf(n++ + ". %s | W %d | %s%n", item.menuName, item.menuPrice, item.menuDesc);
        }
        int num = sc.nextInt();
        String selectedMenuInfo = String.format("\" %s | W %d | %s\"", burgers.get(num - 1).menuName, burgers.get(num - 1).menuPrice, burgers.get(num - 1).menuDesc);
        String selectedMenuName = burgers.get(num - 1).menuName;
        int price = burgers.get(num -1).menuPrice;
        order.addOrNot(selectedMenuInfo, selectedMenuName, price);
    }

    public void side() {
        ArrayList<Product> side = new ArrayList<>();
        side.add(new Product("치즈스틱 2조각", "자연 모짜렐라 치즈로 빈틈 없이 고소한 맥도날드 치즈스틱", 2500));
        side.add(new Product("슈림프 스낵랩", "슈림프 패티에 화이트마요와 스위트 칠리 소스로 매콤달콤하게!", 2300));
        side.add(new Product("후렌치 후라이", "맥도날드의 역사가 담긴 월드 클래스 후렌치 후라이", 2000));
        side.add(new Product("맥너겟 6조각", "바삭하고 촉촉한 치킨이 한 입에 쏙!", 3500));
        side.add(new Product("맥윙 2조각", "겉은 바삭! 속은 쫄~깃한 치킨 윙!", 3200));
        side.add(new Product("코울슬로", "양배추,당근,양파가 마요 드레싱과 어우러져 아삭하게 씹히는 샐러드", 1900));

        System.out.println("\"McDonald's 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품 메뉴판을 보시고 상품을 골라 입력해 주세요.\n");
        System.out.println("[ Side MENU ]");
        int n = 1;
        for (Product item : side) {
            System.out.printf(n++ + ". %s | W %d | %s%n", item.menuName, item.menuPrice, item.menuDesc);
        }
        int num = sc.nextInt();
        String selectedMenuInfo = String.format("\" %s | W %d | %s\"", side.get(num - 1).menuName, side.get(num - 1).menuPrice, side.get(num - 1).menuDesc);
        String selectedMenuName = side.get(num - 1).menuName;
        int price = side.get(num -1).menuPrice;
        order.addOrNot(selectedMenuInfo, selectedMenuName, price);
    }

    public void drink() {
        ArrayList<Product> drink = new ArrayList<>();
        drink.add(new Product("코카콜라", "갈증해소 뿐만이 아니라 기분까지 상쾌하게!", 1700));
        drink.add(new Product("코카콜라 제로", "상쾌한 맛은 살리면서 웰빙 트렌드에 맞춰 설탕과 칼로리 제로", 1700));
        drink.add(new Product("스프라이트", "청량함에 레몬, 라임향을 더한 시원함!", 1700));
        drink.add(new Product("바닐라 쉐이크", "신선한 우유에 달콤한 바닐라 시럽으로 맛을 더한 깔끔한 쉐이크!", 2800));
        drink.add(new Product("딸기 쉐이크", "신선한 우유에 상큼한 딸기 시럽으로 맛을 더한 부드러운 쉐이크!", 2800));
        drink.add(new Product("초코 쉐이크", "신선한 우유에 달콤한 초코렛 시럽이  들어간 부드러운 쉐이크!", 2800));

        System.out.println("\"McDonald's 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품 메뉴판을 보시고 상품을 골라 입력해 주세요.\n");
        System.out.println("[ Drinks MENU ]");
        int n = 1;
        for (Product item : drink) {
            System.out.printf(n++ + ". %s | W %d | %s%n", item.menuName, item.menuPrice, item.menuDesc);
        }
        int num = sc.nextInt();
        String selectedMenuInfo = String.format("\" %s | W %d | %s\"", drink.get(num - 1).menuName, drink.get(num - 1).menuPrice, drink.get(num - 1).menuDesc);
        String selectedMenuName = drink.get(num - 1).menuName;
        int price = drink.get(num -1).menuPrice;
        order.addOrNot(selectedMenuInfo, selectedMenuName, price);
    }

    public void dessert() {
        ArrayList<Product> dessert = new ArrayList<>();
        dessert.add(new Product("초코 오레오 맥플러리", "초콜릿 퍼지와 오레오 쿠키까지! 달달함이 두 배로!", 3000));
        dessert.add(new Product("딸기 오레오 맥플러리", "상큼한 딸기와 오레오 쿠키가 신선한 우유 아이스크림에 퐁당!", 3000));
        dessert.add(new Product("오레오 맥플러리", "우유 듬뿍 신선한 아이스크림에 오레오 쿠키가 가득!", 3000));
        dessert.add(new Product("오레오 아포가토", "진한 에스프레소에 바닐라 아이스크림으로 달콤 쌉쌀하게", 3500));
        dessert.add(new Product("스트로베리콘", "신선한 1등급 원유와 딸기과즙으로 만든 아이스크림", 1400));
        dessert.add(new Product("아이스크림콘", "신선한 우유로 만든 부드러운 아이스크림 콘", 1100));

        System.out.println("\"McDonald's 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품 메뉴판을 보시고 상품을 골라 입력해 주세요.\n");
        System.out.println("[ Dessert MENU ]");
        int n = 1;
        for (Product item : dessert) {
            System.out.printf(n++ + ". %s | W %d | %s%n", item.menuName, item.menuPrice, item.menuDesc);
        }
        int num = sc.nextInt();
        String selectedMenuInfo = String.format("\" %s | W %d | %s\"", dessert.get(num - 1).menuName, dessert.get(num - 1).menuPrice, dessert.get(num - 1).menuDesc);
        String selectedMenuName = dessert.get(num - 1).menuName;
        int price = dessert.get(num -1).menuPrice;
        order.addOrNot(selectedMenuInfo, selectedMenuName, price);
    }
}
