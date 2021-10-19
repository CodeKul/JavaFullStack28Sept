package finalkeyword;

/**
 * final variable => it used to declare constant
 * final method => if you declare method as final as you cannot override this method
 * final class => if you declare final class  then it can not inherit
 */
public final class FinalKeywordDemo {

   final int i ;//constant

    public FinalKeywordDemo(){
        i = 10;
    }

    public void display(){ //final
      int i = 16;
    }

    public static void main(String[] args) {
        FinalKeywordDemo finalKeywordDemo =  new FinalKeywordDemo();
        finalKeywordDemo.display();
        System.out.println(finalKeywordDemo.i);
    }
}
//
//class Test extends FinalKeywordDemo{
//
//    @Override
//    public void display() {
//        System.out.println("in   display");
//    }
//}