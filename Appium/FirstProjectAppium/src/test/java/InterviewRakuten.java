public class InterviewRakuten {
    public static void main(String[] args) {

        String test = "ABCD23s3342sROTVMFMR34.98 DG 34 ASD  234234   AADDD 567S46734";

        String output = test.replaceAll("\\D", "");

        System.out.println((output));
    }
}
