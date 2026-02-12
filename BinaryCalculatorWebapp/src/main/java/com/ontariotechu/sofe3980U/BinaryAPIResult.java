package com.ontariotechu.sofe3980U;

public class BinaryAPIResult {
    private String operand1;
    private String operator;
    private String operand2;
    private String result;

    // Constructor: accepts Binary objects but stores Strings internally
    public BinaryAPIResult(Binary operand1, String operator, Binary operand2, Binary result) {
        this.operand1 = operand1.getValue();  // convert Binary to String
        this.operator = operator;             // String operator
        this.operand2 = operand2.getValue();  // convert Binary to String
        this.result = result.getValue();      // convert Binary to String
    }

    // Getters
    public String getOperand1() {
        return operand1;
    }

    public String getOperator() {
        return operator;
    }

    public String getOperand2() {
        return operand2;
    }

    public String getResult() {
        return result;
    }
}
