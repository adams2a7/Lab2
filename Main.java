class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

  int totalMM;
  double blue, brown, green, orange, red, yellow;
  totalMM = 55 * 11;
  blue = totalMM * .24;   
  brown = totalMM * .13;
  green = totalMM * .16;
  orange = totalMM * .20;
  red = totalMM * .13;
  yellow = totalMM * .14;

  System.out.println("blue: " + blue);
  System.out.println("brown: " + brown);
  System.out.println("green: " + green);
  System.out.println("orange: " + orange);
  System.out.println("red: " + red);
  System.out.println("yellow: " + yellow);

  double Sum;
  Sum = blue + brown + green + orange + red + yellow;

  System.out.println("Sum: " + Sum);

  System.out.println("Blue over Brown and Red over Orange " + (blue>brown && red>orange)); 
  System.out.println("Brown is less than or equal to Green " + (brown<=green));
  System.out.println("Sum is equal to Total " + (Sum==totalMM)); 

 
  


    
  }
}