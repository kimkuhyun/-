package basic;

public enum _07 {
    //KOR, CHI, JAP, USA 네 개의 상수를 갖는 enum을 생성하고
    // 첫 번째 값은 "나라 한글명"이고 두 번째 값은 "대표음식"으로 지정한다.
    // public void notifyFood(String country) 메소드를 만들고
    // country 값과 동일한 한글명인 나라의 음식을 다음과 같이 출력하도록 구현하세요.
    // country에 "중국"이 들어오면 "중국의 대표음식은 짜장면입니다."라고 나오도록 하세요.
    // (각 국의 음식은 한국=불고기, 중국=짜장면, 일본=초밥, 미국=햄버거)
    KOR("한국", "김치"),
    CHI("중국", "만두"),
    JAP("일본", "초밥"),
    USA("미국", "프라이치킨");

    private String country;
    private String food;

    public String getcountry() {
        return country;
    }
    public String getFood() {
        return food;
    }
    _07(String country, String food) {
        this.country = country;
        this.food = food;
    }
    public void notifyFood(String country){
        for(_07 a : _07.values()){
            if(a.getcountry().equals(country)){
                System.out.println(country+a.getFood());
            }
        }




    }




}
