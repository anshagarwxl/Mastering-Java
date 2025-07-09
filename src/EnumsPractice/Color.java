package EnumsPractice;

enum Color{
    RED("danger"),YELLOW("warning"),GREEN("safe")
     String description;
    Color(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
}

class Test{
    private Color c;
    private String name;

    public static void main(String[] args) {
        for(Color; Color.values()){


        }
    }
}

class Demo{
    static String dayofweek = "S";
    public enum DAY{
        SUNDAY,MONDAY{
            String getDescription(){
                return "Bad Day";
            }
        }
    }
}
