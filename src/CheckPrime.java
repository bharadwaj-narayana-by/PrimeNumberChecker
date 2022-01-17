import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckPrime {

    public static void main(String[] args) {
        List<Integer> numToCheck = Arrays.asList(1,2,3,5,6,12,13);
        List<Integer> primeNo = numToCheck.stream().filter(x -> {
            if (x <= 1) {
                return false;
            }else {
                for (int i = 2; i < Math.sqrt(x); i++) {
                    if (x % i == 0) {
                        return false;
                    }
                }

            }
            return true;

        }).collect(Collectors.toList());
        System.out.println(primeNo);
    }
}
