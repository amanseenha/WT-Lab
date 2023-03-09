public class q2 {
    int subtract(int a, int b){
        return a-b;
    }
    float subtract(float a, float b){
        return a-b;
    }
    public static void main(String[] args) {
        q2 obj1 = new q2();
        System.out.println(obj1.subtract(56, 44));
        System.out.println(obj1.subtract(5.6f, 4.4f));
    }
}
