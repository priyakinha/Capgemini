import java.util.Stack;

public class StackStructure {
    //infix topostfix conversion
    
    public static String infixToPostfix(String exp) {
    Stack<Character> stack = new Stack<>();
    StringBuilder postfix = new StringBuilder();
    for (int i = 0; i < exp.length(); i++) {
        char ch = exp.charAt(i);
        if (Character.isLetterOrDigit(ch)) {
            postfix.append(ch);
        }
        // Opening bracket
        else if (ch == '(') {
            stack.push(ch);
        }
        // Closing bracket
        else if (ch == ')') {
            while (!stack.isEmpty() && stack.peek() != '(') {
                postfix.append(stack.pop());
            }
            stack.pop(); // remove '('
        }
        // Operator
        else {
            while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                postfix.append(stack.pop());
            }
            stack.push(ch);
        }
    }
    // Pop remaining operators
    while (!stack.isEmpty()) {
        postfix.append(stack.pop());
    }
    return postfix.toString();
}
private static int precedence(char op) {
    switch (op) {
        case '+':
        case '-': return 1;
        case '*':
        case '/': return 2;
        case '^': return 3;
    }
    return -1;
}

    public static void main(String[] args) {
        String infix = "((a+b)*(z+x))";
        System.out.println(infixToPostfix(infix));

    }
}
