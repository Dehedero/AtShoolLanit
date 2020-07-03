package AtSchool;

public class Kotik {


    int prettiness;
    int weight;
    String name;
    String meow;
    int satiety;

    public Kotik() {
    }

    public Kotik(int prettiness, int weight, String name, String meow, int satiety) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.satiety = satiety;
    }


    void setKotik(int prettiness, int weight, String name, String meow, int satiety) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.satiety = satiety;
    }

    int giveMeMoney() {
        return 100;
    }

    void sayMeow() {
        System.out.println(name + " говорит " + meow);
    }

    boolean eat(int satiety) {
        this.satiety += satiety;
        ;
        return true;
    }

    boolean eat(int satiety, String food) {
        if (food.equals("Whiskas")) {
            this.satiety += satiety;
        } else {
            this.satiety += 10;
        }
        return true;
    }

    boolean eat() {
        eat(100, "Milk");
        return true;
    }

    boolean play() {
        satiety -= 30;
        return true;
    }

    boolean sleep() {
        satiety -= 25;
        return true;
    }

    boolean washUp() {
        satiety -= 10;
        return true;
    }

    boolean chaseMouse() {
        satiety -= 40;
        return true;

    }

    boolean playWithYourself() {
        satiety -= 35;
        return true;
    }

    boolean goToTheToiletTray() {
        satiety -= 10;
        return true;
    }

    void liveAnotherDay() {
        int h = 8;
        for (int i = 0; i < 24; i++) {
            int flag = (int) (Math.random() * h + 1);
            if (satiety > 0) {
                switch (flag) {
                    case 1:
                        sayMeow();
                        System.out.println("Cat say meow <true>");
                        break;
                    case 2:
                        boolean eat = eat();
                        System.out.println("Cat eating " + eat);
                        break;
                    case 3:
                        boolean play = play();
                        System.out.println("Cat " + play);
                        break;
                    case 4:
                        boolean sleep = sleep();
                        System.out.println("Cat " + sleep);
                        break;
                    case 5:
                        boolean washUp = washUp();
                        System.out.println("Cat " + washUp);
                        break;
                    case 6:
                        boolean chaseMouse = chaseMouse();
                        System.out.println("Cat " + chaseMouse);
                        break;
                    case 7:
                        boolean playWithYourself = playWithYourself();
                        System.out.println("Cat " + playWithYourself);
                        break;
                    case 8:
                        boolean goToTheToiletTray = goToTheToiletTray();
                        System.out.println("Cat " + goToTheToiletTray);
                        break;

                }
            } else {
                System.out.println("Cat want eat ");
                boolean eat = eat(10);
                System.out.println("Cat eat " + eat);
            }
        }
    }

    public static void main(String[] args) {
        Kotik kotik = new Kotik(50, 3100, "Stepan", "Meoooooow", 0);
        kotik.liveAnotherDay();
        System.out.println(kotik.prettiness + " - prettiness");
        System.out.println(kotik.weight + " - weight");
        System.out.println(kotik.name + " - name");
        System.out.println(kotik.meow + " say " + kotik.name);


    }
}
