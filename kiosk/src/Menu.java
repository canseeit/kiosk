import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    String menuName;
    String menuDesc;

    public Menu(String menuName, String menuDesc) {
        this.menuName = menuName;
        this.menuDesc = menuDesc;
    }

    public Menu() {
    }

    public void menu() {
        Product product = new Product();
        Order order = new Order();
        ArrayList<Menu> mainMenu = new ArrayList<>();
        mainMenu.add(new Menu("Burgers", "주문 즉시 바로 조리해 더욱 맛있는, 맥도날드의 다양한 버거를 소개합니다."));
        mainMenu.add(new Menu("Side", "가볍게 즐길 수 있는 사이드 메뉴를 소개합니다."));
        mainMenu.add(new Menu("Drinks", "언제나 즐겁게, 다양한 음료를 부담없이 즐기세요!"));
        mainMenu.add(new Menu("Dessert", "언제나 맛있는 디저트 메뉴!\n"));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\" McDonald's 에 오신걸 환영합니다. \"");
            System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해 주세요.\n");
            System.out.println("[ McDonald's MENU ]");
            int n = 1;
            for (Menu item : mainMenu) {
                System.out.printf(n++ + ". %s | %s%n", item.menuName, item.menuDesc);
            }
            System.out.println("[ ORDER MENU ]");
            System.out.println("5. Order  | 장바구니를 확인 후 주문합니다.");
            System.out.println("6. Cancel | 진행중인 주문을 취소합니다.");
            int selectOrder = sc.nextInt(); // 메뉴 번호
            switch (selectOrder) {
                case 1 -> product.burger();     // 버거 주문
                case 2 -> product.side();       // 사이드 주문
                case 3 -> product.drink();      // 음료 주문
                case 4 -> product.dessert();    // 디저트 주문
                case 5 -> order.orderList();    // 주문 확인
                case 6 -> order.orderCancel();  // 주문 취소
                default -> System.out.println("알맞은 번호를 입력해 주세요.\n");
            }
        }
    }
}
