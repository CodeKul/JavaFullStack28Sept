package operators;

/**
 * unary operator  => a++,++a,a--,--a
 * arithmetic operator => +,-,*,/,%
 * relational operator => < , > ,  instanceof,
 * assignment operator => = ,==
 * shift operator =>  << >>
 * logical operator => & |  && ,||
 */

public class OperatorsDemo {

    public static void main(String[] args) {
        int i = 10;
        int k = 10;
        System.out.println(i++);//10 i = i+1
        System.out.println(i);
        System.out.println(++i);//12 i+1 = i

        System.out.println(i--);//   i= i-1
        System.out.println(i);//   11
        
        int j= 4;
//        System.out.println(k/j);
//        System.out.println(k%j);

//        System.out.println(k<<2);//k*2^2 = 10*4 = 40
//        System.out.println(k>>2);//k/2^2 = 10/4 = 2

        System.out.println(k & j);
        System.out.println(k | j);



        if(k!=10  || j==3){
            System.out.println("If executed");
        }else {
            System.out.println("else");
        }
    }
}
