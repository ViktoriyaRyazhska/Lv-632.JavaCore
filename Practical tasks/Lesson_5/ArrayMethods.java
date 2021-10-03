public class ArrayMethods {
    static int positiveNumb;
    static int negativeNumb;

    static void biggestElement (int[] array){       //Find Biggest element
        int big=array[0];
        for (int i=0; i<array.length; i++){
            if(array[i]>big)  big=array[i];
        }
        System.out.println("The biggest number is: "+ big);;
    }

    static void positiveSum (int[] array){           //Calculating the sum of positive elements
        int count=0;
        int sum=0;
        for (int a: array){
            if (a>0){
                sum+=a;
                count++;
            }
        }
        System.out.println("Sum of positive elements is: "+ sum+" ("+count+" elements)\n");
        positiveNumb=count;
    }

    static void amountNegative(int[] array){        //Calculating the sum of negative elements
        int count=0;
        int amount=0;
        for (int a: array){
            if(a<0) {
                amount+=a;
                count++;
            }
        }
        System.out.println("Amount of negative element is: "+ amount+" ("+count+" elements)\n");
        negativeNumb=count;
    }

    static void compare (int positive, int negative){           //Comparison numbers of positive and negative elements
        String result;
        if (positive==negative)         result = "number of positive and negative elements is equal\n";
        else if (positive>negative)     result = "array has mostly positive elements\n";
        else                            result = "array has mostly negative elements\n";
        System.out.println("Result: "+result);
    }
}
