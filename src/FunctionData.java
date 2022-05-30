import java.util.List;

public class FunctionData {
    private List<String> input;
    private String output;
    
    public FunctionData(List<String> input, String output) {
        this.input = input;
        this.output = output;
    }
    
    public List<String> getInput() {return input;}
    public String getOutput() {return output;}
}