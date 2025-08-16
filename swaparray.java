public class swaparray {
    public static void main(String[] args) {
        String[] ipl = {"rcb", "csk", "kkr", "mi", "rr"};
        
        String temp = ipl[0];
        ipl[0] = ipl[1];
        ipl[1] = temp;
        
        for (int i = 0; i < ipl.length; i++) {
            System.out.println(ipl[i]);
        }
    }
}
