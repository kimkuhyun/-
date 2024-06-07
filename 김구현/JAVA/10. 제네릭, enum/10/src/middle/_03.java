package middle;

public enum _03 {
    //3. 커피 메뉴를 갖는 enum을 생성하고 AMERICANO, LATTE, MOCHA, COLDBREW 4개로 지정한다.
    // 가격이 값이 되고 순서대로 2000, 3000, 4000, 4500으로 지정한다.
    // 메뉴의 총 가격을 계산하는 추상 메소드를 정의하고 각각의 상수에서 구현하는데 아메리카노(아이스 300 추가),
    // 라떼(아이스 500 추가), 모카(휘핑 1000 추가), 콜드브루(시럽 200 추가) 모든 메뉴 옵션 없는 주문은
    // 지정한 가격대로 진행된다. totalPrice(int optionOrder, int normalOrder) 옵션 추가 잔수와
    // 일반 메뉴 잔수를 받아서 각 메뉴의 가격을 계산하는 추상 메소드 구현한다.
    // 아아 2잔 뜨아 1잔 아라 1잔 휘핑 모카 2잔 콜드브루 2잔일 때의 가격을 출력하세요.

    AMERICANO(2000,"아이스 300원 추가"){

        @Override
        public int totalprice(int optionOrder, int normalOrder) {

           return (normalOrder*2000) + (optionOrder*300);
        }
    },
    LATTE(3000,"아이스 500원 추가"){
        @Override
        public int totalprice(int optionOrder, int normalOrder) {

            return (normalOrder*3000) + (optionOrder*500);
        }
    },
    MOCHA(4000,"휘핑 1000원 추가"){
        @Override
        public int totalprice(int optionOrder, int normalOrder) {

            return (normalOrder*4000) + (optionOrder*1000);
        }
    },
    COLDBREW(4500,"시럽 200원 추가"){
        @Override
        public int totalprice(int optionOrder, int normalOrder) {

            return (normalOrder*4500) + (optionOrder*200);
        }
    };

    private int price;
    private String optionDescription;
    _03(int price, String optionDescription) {
        this.price = price;
        this.optionDescription = optionDescription;
    }
    public int getPrice() {
        return price;
    }
    public String getOptionDescription() {
        return optionDescription;
    }

    public abstract int totalprice(int optionOrder, int normalOrder);


    public static void main(String[] args) {
        int total = _03.AMERICANO.totalprice(2,3)+
                    _03.LATTE.totalprice(1,1)+
                    _03.MOCHA.totalprice(2,2)+
                    _03.COLDBREW.totalprice(0,2);
        System.out.println("총 주문 금액: " + total +"원");
    }
}
