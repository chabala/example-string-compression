public class StringCompression {

    public String stringCompression(String input) {
        StringBuilder result = new StringBuilder();
        for (int count = 1, valueIndex = 0; valueIndex < input.length(); valueIndex++) {
            char value = input.charAt(valueIndex);
            for (int nextValueIndex = valueIndex + 1; nextValueIndex < input.length(); nextValueIndex++) {
                char nextValue = input.charAt(nextValueIndex);
                if (value == nextValue) {
                    count++;
                    valueIndex++;
                } else {
                    break;
                }
            }
            if (count > 1) {
                result.append(value).append(count);
            } else {
                result.append(value);
            }
            count = 1;
        }
        return result.toString();
    }
}
