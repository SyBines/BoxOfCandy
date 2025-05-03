public class Main{
    public static void main(String[] args) {
        // moveCandyToFirstRow test cases
        Candy one = new Candy("lime");
        Candy two = new Candy("orange");
        Candy three = new Candy("cherry");
        Candy four = new Candy("lemon");
        Candy five = new Candy("grape");
        Candy six = new Candy();
        Candy[][] candies1 = {{six, one, six}, {six, two, six}, {six, six, three}, {six, four, five}};
        BoxOfCandy box1 = new BoxOfCandy(candies1);
        System.out.println(box1.moveCandyToFirstRow(0));
        System.out.println(box1.moveCandyToFirstRow(1));

        // removeNextByFlavor test cases
        Candy[][] candies2 = {{one, one, null, four, null}, {two, null, null, one, one}, {three, null, four, null, two}};
        BoxOfCandy box2 = new BoxOfCandy(candies2);
        System.out.println(box2.removeNextByFlavor("cherry"));
        System.out.println(box2.removeNextByFlavor("lime"));
        System.out.println(box2.removeNextByFlavor("grape"));
        for (Candy[] list : candies2){
            for (int i = 0; i < list.length; i++){
                if (list[i] != null) System.out.print(list[i].getFlavor()+" ");
                else System.out.print("null ");
            }
            System.out.println();
        }

    }
}