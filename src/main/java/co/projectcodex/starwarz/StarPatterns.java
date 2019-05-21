package co.projectcodex.starwarz;

public class StarPatterns {

    /**
     *
     * line(4) prints * * * *
     *
     * line(7) prints * * * * * * *
     *
     *
     * @param size
     */

    public static void line(int size) {

        for(int i =0; i < size;i++){
            System.out.print("* ");
        }


    }
    
    /**
     * Print a square of stars of a specified size
     *
     * squareStars(4) should print
     *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     *
     * or
     *
     * squareStars(7) should print
     *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     *
     * @param size
     */
    public static void squareStars(int size) {
        for(int i = 0; i < size; i++){
            for (int j = 0;j<size;j++){
                System.out.print("* ");


            }
            System.out.print("\n");

        }

    }


    /**
     *
     * triangleBottomBase(4)
     *
     * prints
     *
     * *
     * * *
     * * * *
     * * * * *
     *
     * triangleBottomBase(7)
     *
     * prints
     *
     *  *
     *  * *
     *  * * *
     *  * * * *
     *  * * * * *
     *  * * * * * *
     *  * * * * * * *
     *
     *
     *
     * @param size
     */
    public static void triangleBottomBase(int size) {
        int hold = 1;
        for(int i = 0; i < size; i++){
            for(int j = 0 ;j<hold;j++){
                System.out.print("* ");

            }
            if(hold!=size) {
                hold++;
            }
            System.out.print("\n");

        }
    }

    /**
     * triangleTopBase(3)
     *
     * prints
     *
     * * * *
     * * *
     * *
     *
     * triangleTopBase(7)
     *
     * prints
     *
     *  * * * * * * *
     *  * * * * * *
     *  * * * * *
     *  * * * *
     *  * * *
     *  * *
     *  *
     *
     *
     * @param size
     */

    public static void triangleTopBase(int size) {
        int hold = size;
        for(int i = 0; i < size; i++){
           for(int j = 0 ;j<hold;j++){
                System.out.print("* ");

            }
            hold--;
            System.out.print("\n");

        }
    }

    /**
     * emptySquare(4);
     *
     * prints
     *
     *  * * * *
     *  *     *
     *  *     *
     *  * * * *
     *
     *  emptySquare(7);
     *
     *  * * * * * * *
     *  *           *
     *  *           *
     *  *           *
     *  *           *
     *  *           *
     *  * * * * * * *
     *
     * @param size
     */
    public static void emptySquare(int size) {
        for(int i = 0; i < size; i++){
            if(i==0 || i==size-1){
                for(int j = 0 ;j<size;j++){
                        System.out.print("* ");
                }
            }
            else{
                for(int j = 0 ;j<size;j++){
                    if(j==0 || j == size-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }



            }

            System.out.print("\n");

        }

    }


    public static void main(String[] args) {

//        squareStars(10);
//        squareStars(5);

//        triangleTopBase(10);
//        triangleBottomBase(7);

        //emptySquare(4);

//        emptySquare(15);


    }




}
