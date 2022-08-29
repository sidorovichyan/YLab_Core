package Task1;

public class Main {

    static int arraySize = 10;


    public static void main(String[] args) {


        double [] [] array = new double [arraySize][arraySize];

        for(int i=0;i<arraySize;i++)
        {
            for(int j=0;j<arraySize;j++)
            {
                array[i][j] =  Math.random();
            }
        }

        double maxValue = array[0][0];
        double minValue = array[0][0];
        double average = 0;

        for(int i=0;i<arraySize;i++)
        {
            for(int j=0;j<arraySize;j++)
            {
                if(array[i][j] < minValue)
                {
                    minValue = array[i][j];
                }
                if(array[i][j] > maxValue)
                {
                    maxValue = array[i][j];
                }
                average = average + array[i][j];
            }
        }
        average = (average/(arraySize*arraySize));

        System.out.println("Max: "+maxValue);
        System.out.println("Min:"+minValue);
        System.out.println("Average:"+average);




    }
}
