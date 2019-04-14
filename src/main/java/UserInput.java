public class UserInput {

    public static class TextInput {
        private String output = "";

        void add(char c) {
            this.output = this.output + c;
        }

        String getValue() {
            return this.output;
        }

    }

    public static class NumericInput extends TextInput {
        void add(char c) {
            if (Character.isDigit(c)) super.add(c);
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');

        System.out.println(input.getValue());
    }
}