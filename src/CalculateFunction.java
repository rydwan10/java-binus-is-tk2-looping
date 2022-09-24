import java.util.ArrayList;
import java.util.List;

public class CalculateFunction {
    private String resultArr = "";
    private int resultCalculation = 0;

    public String getResultArr() {
        return resultArr;
    }

    public void setResultArr(String resultArr) {
        this.resultArr = resultArr;
    }

    public int getResultCalculation() {
        return resultCalculation;
    }

    public void setResultCalculation(int resultCalculation) {
        this.resultCalculation = resultCalculation;
    }

    public static CalculateFunction generateAndCalculateEvenNumber(int elementCount) {
        CalculateFunction result = new CalculateFunction();
        List<Integer> arr = new ArrayList<>();

        int res = 1;
        while(arr.stream().count() != elementCount) {
            if(res % 2 == 0) {
                result.setResultArr(result.getResultArr() + " " + res);
                result.setResultCalculation(result.getResultCalculation() + res);
                arr.add(res);
            }
            res++;
        }

        return result;
    }

    public static CalculateFunction generateAndCalculateOddNumber(int elementCount) {
        CalculateFunction result = new CalculateFunction();
        List<Integer> arr = new ArrayList<>();

        int res = 1;
        while(arr.stream().count() != elementCount) {
            if(res % 2 != 0) {
                result.setResultArr(result.getResultArr() + " " + res);
                result.setResultCalculation(result.getResultCalculation() + res);
                arr.add(res);
            }
            res++;
        }

        return result;
    }

    public static CalculateFunction generateAndCalculateFibonacciNumber(int elementCount) {
        CalculateFunction result = new CalculateFunction();

        int a = 0, b = 1, c = 0;

        result.setResultArr(" " + b);
        result.setResultCalculation(b);
        for (int i = 1; i < elementCount; i++) {
            c = a + b; // 3
            a = b; // a = 2
            b = c; // b = 3

            result.setResultArr(result.getResultArr() + " " + c);
            result.setResultCalculation(result.getResultCalculation() + c);
        }

        return result;
    }
}
