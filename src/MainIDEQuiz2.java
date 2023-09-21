import java.util.Scanner;

/* I have neither given nor received any unauthorised aid on this work*/
public class MainIDEQuiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something you want to print: ");
        String x = scanner.nextLine();
        printMe(x);



        System.out.println("Enter a name: ");
        String n  = scanner.nextLine();

        String resultTwo = greeting(n);
        System.out.println(resultTwo);


        System.out.println("Enter four numbers, separate each with spaces: ");
        String s = scanner.nextLine();
        String[] nums = s.split(" ");
        int[] nums1 = new int [4];
        for (int i=0;i<4;i++){
            nums1[i] = Integer.parseInt(nums[i]);
        }
        int resultThree = add(nums1[0],nums1[1],nums1[2],nums1[3]);


        System.out.println(resultThree);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter number: ");
        int b = scanner.nextInt();
        int resultOne = add(a,b);
        System.out.println(resultOne);





    }

    static int add(int numOne,int numTwo){
        return numOne + numTwo;
    }
    static String greeting(String name){
        return "Bonjour, " + name + "!";
    }
    static int add(int numeOne, int numTwo, int numThree, int numFour){
        int x  = add(numeOne,numTwo);
        int y = add(numThree,numFour);
        int z = add(x,y);
        return z;
    }
    static void printMe(String toBePrinted){
        System.out.println(toBePrinted);
    }
}
