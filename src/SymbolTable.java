import java.util.Map;
import java.util.HashMap;

public class SymbolTable {
    private SymbolTable parent;
    private Map<String, String[]> functions;
    private Map<String, String> variables;
    public SymbolTable(SymbolTable parent) {
        this.parent = parent;
        this.functions = new HashMap<>();
        this.variables = new HashMap<>();
    }
    public SymbolTable(SymbolTable parent, Map<String, String[]> functions, Map<String, String> variables) {
        this.parent = parent;
        this.functions = functions;
        this.variables = variables;
    }

    public SymbolTable getParent() {
        return parent;
    }
    
    public boolean containsFunction(String name) {
        if (functions.containsKey(name)) return true;
        if (parent == null) return false;
        return parent.containsFunction(name);
    }
    public boolean containsVariable(String name) {
        if (variables.containsKey(name)) return true;
        if (parent == null) return false;
        return parent.containsVariable(name);
    }
    public String[] getFunction(String name) {
        String[] func = functions.get(name); 
        if (func != null) return func;
        return parent.getFunction(name);
    }
    public String getVariable(String name) {
        String var = variables.get(name); 
        if (var != null) return var;
        return parent.getVariable(name);
    }
    public void putFunction(String name, String[] types) {
        functions.put(name, types);
    }
    public void putVariable(String name, String type) {
        variables.put(name, type);
    }
}
