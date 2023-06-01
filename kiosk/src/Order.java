import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private static ArrayList<String> orderlist = new ArrayList<>();
    private static int totalPrice = 0;
    int waitNum = 1;
    Scanner sc = new Scanner(System.in);

    // 구매 화면  - 선택메뉴 출력
    public void addOrNot(String selectedMenuInfo, String selectedMenuName, int price) { // 상품을 객체로 담아온 게 아닌?
        System.out.println(selectedMenuInfo);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                orderlist.add(selectedMenuInfo);
                totalPrice += price;
                System.out.println(selectedMenuName + " 가 장바구니에 추가되었습니다.\n");
                break;
            } else if (input == 2) {
                System.out.println("취소되었습니다.\n"); // 상세메뉴로 돌아가게 바꾸기
                break;
            } else {
                System.out.println("알맞은 번호를 입력해 주세요.\n");

            }
        }
    }

    // 주문 화면 - 장바구니에 담은 목록, 총 가격 출력
    public void orderList() {
        System.out.println("아래와 같이 주문하시겠습니까?\n");
        System.out.println("[ Orders ]");
        for (String list : orderlist) {
            System.out.println(list);
        }
        System.out.println();
        System.out.println("[ Total ]");
        System.out.println("W " + totalPrice + "\n");
        System.out.println("1. 주문      2. 메뉴판");
        orderFinish();
    }

    // 주문 완료 - 대기번호 출력, 3초 후 메뉴로 이동
    private void orderFinish() {
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("주문이 완료되었습니다!\n");
                System.out.printf("대기번호는 [ %d ] 번 입니다.\n", waitNum);
                System.out.println("(3초 후 메뉴판으로 돌아갑니다.)\n");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                orderlist.clear();
                totalPrice  = 0;
                waitNum += 1;
                break;
            } else if (input == 2) {
                System.out.println("메뉴판으로 돌아갑니다.\n");
                break;
            } else {
                System.out.println("알맞은 번호를 입력해 주세요.\n");
            }
        }
    }

    // 주문 취소 - 장바구니 초기화 후 메뉴 출력
    public void orderCancel() {
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                orderlist.clear();
                totalPrice  = 0;
                System.out.println("진행하던 주문이 취소되었습니다.\n");
                break;
            } else if (input == 2) {
                System.out.println("메뉴판으로 돌아갑니다.\n");
                break;
            } else {
                System.out.println("알맞은 번호를 입력해 주세요.\n");
            }
        }
    }
}
