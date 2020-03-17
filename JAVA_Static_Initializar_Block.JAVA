private static final Scanner scanner = new Scanner(System.in);
public static int H;
public static int B;
public static boolean flag;

static{
    H= scanner.nextInt();
    B= scanner.nextInt();
    if((B<=0) || (H<=0)){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        flag = false;
    }else{
        flag = true;
    }
}