package burgers;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this(bun, meat, cheese, greens);
        this.mayonnaise = mayonnaise;
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
    }

    public Burger(String bun, String meat1, String meat2, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = String.join(", ", meat1, meat2);
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Burger contains {");
        String delimiter = "; ";

        addField(bun, sb, delimiter);
        addField(meat, sb, delimiter);
        addField(cheese, sb, delimiter);
        addField(greens, sb, delimiter);
        addField(mayonnaise, sb, delimiter);

        sb.delete(sb.length() - delimiter.length(), sb.length());
        sb.append("}");

        return sb.toString();
    }

    private StringBuilder addField(String nameField, StringBuilder sb, String delimiter) {
        if (nameField != null) {
            sb.append(nameField).append(delimiter);
        }

        return sb;
    }
}
