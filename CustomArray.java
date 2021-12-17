public class CustomArray <T extends Number>{
    Object x;
    public CustomArray(Object o){
        this.x = o;
    }
    public void show(){
        System.out.println(x);
    }
}
class Test{
    public static void main(String[] args) {
        CustomArray<Integer> x =  new CustomArray<>(565);
        x.show();

//        CustomArray<String> s = new CustomArray<String>(4848);
//        x.show();
    }
}
