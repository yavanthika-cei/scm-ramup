package controlflowstatements;

public class BranchingStatements {
    public static void main(String[] args) {
    
        for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; 
    }
    if (i % 2 == 0) {
        continue; 
    }
    System.out.println(i);
}
    }
}
