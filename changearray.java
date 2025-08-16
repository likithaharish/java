public class changearray {
    public static void main(String[] args) {
        String[] ipl = {"rcb", "csk", "kkr", "mi", "rr"};
        ipl[0] = "csk";  
        for(int i = 0; i < ipl.length; i++) {
            System.out.println(ipl[i]);
        }
    }
}
