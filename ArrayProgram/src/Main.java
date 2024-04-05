public class Main {
    public static void main(String[] args) {
        int marks[] = {60,70,89,92,45};

        int sumOfMarks = calculateTotalMarks(marks);
        System.out.println("Total Sum Of Marks : "+sumOfMarks);

        int lowestMark = calculateLowestMark(marks);
        System.out.println("Lowest Marks :"+lowestMark);

        int highestMark = calculateHighestMark(marks);
        System.out.println("Highest Mark :" + highestMark);

        int secondHighestw = calculateSecondHighest(marks);
        System.out.println("Second Higest : " + secondHighestw);

        int passCount = calculatePassCount(marks);
        System.out.println("No of pass count  : "+passCount);

        int failCount = calculateFailCount(marks);
        System.out.println("No of fail Count : " + failCount);

    }

    private static int calculateFailCount(int[] marks) {
        int count = 0;
        for(int i=0; i<marks.length; i++){
            if(marks[i]<50){
                count++;
            }
        }
        return count;

    }

    private static int calculatePassCount(int[] marks) {
        int count = 0;
        for(int i=0; i<marks.length; i++){
            if(marks[i]>=50){
                count++;
            }
        }
        return count;
    }



    private static int calculateSecondHighest(int[] marks) {
       int h = calculateHighestMark(marks);
        int diff = h - marks[0];
        int secondmax = 0;
        for(int i=0; i<marks.length; i++){

            if(h-marks[i]<diff && marks[i] != h){
                diff = h-marks[i];
                secondmax = marks[i];
            }
        }
        return secondmax;

    }

    private static int calculateHighestMark(int[] marks) {
        int h=marks[0];
        for(int i=1; i<marks.length; i++){
            if(marks[i]>h){
                h = marks[i];
            }
        }
        return h;
    }

    private static int calculateLowestMark(int[] marks) {
        int l=marks[0];
        for(int i=1; i<marks.length; i++){
            if(marks[i]<l){
                l = marks[i];
            }
        }
        return l;
    }



    private static int calculateTotalMarks(int[] marks) {

        int sum=0;
        for(int i=0; i< marks.length; i++){
            sum = sum + marks[i];

        }
        return sum;
    }


}


