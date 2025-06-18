import java.util.Stack;

public class ParenthesesMatcher {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr1 = "(a+b)*{c+d}";
        String expr2 = "(a+b]*{c+d}";

        System.out.println("Expression: " + expr1 + " => Balanced: " + isBalanced(expr1));
        System.out.println("Expression: " + expr2 + " => Balanced: " + isBalanced(expr2));
    }
}

