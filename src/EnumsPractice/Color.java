package EnumsPractice;

enum Color {
    RED("danger"),
    YELLOW("warning"),
    GREEN("safe");

    String description;

    Color(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

class Test {
    private Color c;
    private String name;

    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color + ": " + color.getDescription());
        }
    }
}

class Demo {
    static String dayofweek = "S";

    public enum DAY {
        SUNDAY {
            @Override
            public String getDescription() {
                return "Good Day";
            }
        },
        MONDAY {
            @Override
            public String getDescription() {
                return "Bad Day";
            }
        };

        public abstract String getDescription();
    }

    public static void main(String[] args) {
        for (DAY day : DAY.values()) {
            System.out.println(day + ": " + day.getDescription());
        }
    }
}