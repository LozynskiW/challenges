package pl.javabasics.theorytesting.enums;

public enum NamesEnum {
    LAURENCE(1000) {

        public String getSentence() {
            return "Fear the Old Blood...";
        }

        @Override
        public String toString() {
            return "$classname{}".toLowerCase();
        }
    },
    GHERMAN(2000) {
        public String getSentence() {
            return "Dear, oh dear... What was it? The night? The hunt? Or the terrible dream?";
        }

        @Override
        public int getHealth(int level) {
            return super.getHealth(level);
        }
    },
    GASGOINE(500) {
        public String getSentence() {
            return " You will be one of them... sooner or later";
        }
    };

    public abstract String getSentence();

    NamesEnum(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "NamesEnum{}".toLowerCase();
    }

    public int getHealth(int level) {

        return level*this.health;
    }

    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public enum InnerEnum {
        HUMAN_FORM,
        BEAST_FORM

    }

    public class InnerClass {

        private int x;

        public InnerClass(int x) {
            this.x = x;
        }

        public void print() {
            System.out.println(this.x + " " + NamesEnum.LAURENCE.health);
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }

    public static class StaticClassInEnum {

        public void print() {

            System.out.println(NamesEnum.GHERMAN);

        }
    }
}
