import java.util.*;
class Solution {
    public int solution(String binomial) {
        String operator = binomial.replaceAll("[0-9\\s]", ""); // 숫자와 공백 제거

        // 연산 기호를 기준으로 문자열 나누기
        String[] parts = binomial.split("[" + operator + "]"); // 연산자로 split
        int a = Integer.parseInt(parts[0].trim());
        int b = Integer.parseInt(parts[1].trim());

        // 연산 수행
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> 0; 
        };
    }
}