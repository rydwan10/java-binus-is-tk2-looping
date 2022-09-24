public class Validators {
   public static boolean validateNameLength(String studentName) {
        if(studentName.isBlank()) return false;
        if(studentName.length() < 1 || studentName.length() > 25) return false;
        return true;
    }

    public static boolean validateNIMLength(String NIM) {
       if(NIM.isBlank()) return false;
       if(NIM.length() > 10 || NIM.length() < 10) {
           return false;
       }
       return true;
    }

    public static boolean validateStudentChoosedNumber(int number) {
       if(number < 5 || number > 20) return false;
       return true;
    }
}
